/**
 * 
 */
package com.ex02.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex02.c4.dto.Client;
import com.ex02.c4.service.ClientServiceImpl;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	ClientServiceImpl clientServiceImpl;

	// GET: List of all clients
	@GetMapping("/clients")
	public List<Client> listClients() {
		return clientServiceImpl.listClients();
	}

	// POST: Save a new client
	@PostMapping("/clients")
	public Client saveClient(@RequestBody Client client) {
		return clientServiceImpl.saveClient(client);
	}

	// GET: an client
	@GetMapping("/clients/{id}")
	public Client getClientById(@PathVariable(name = "id") int id) {

		return clientServiceImpl.getClientById(id);
	}

	// PUT: update an client
	@PutMapping("/clients/{id}")
	public Client updateClient(@PathVariable(name = "id") int id, @RequestBody Client client) {
		Client client_selected = new Client();

		client_selected = clientServiceImpl.getClientById(id);
		
		client_selected.setName(client.getName());
		client_selected.setLastname(client.getLastname());
		client_selected.setAddress(client.getAddress());
		client_selected.setEmail(client.getEmail());
		client_selected.setUsername(client.getUsername());
		client_selected.setPassword(client.getPassword());
		client_selected.setDate_up(client.getDate_up());

		return clientServiceImpl.updateClient(client_selected);

	}
	
	//DELETE: delete an client
	@DeleteMapping("/clients/{id}")
	public void deleteClient(@PathVariable(name="id") int id) {
		clientServiceImpl.deleteClient(id);
	}
}

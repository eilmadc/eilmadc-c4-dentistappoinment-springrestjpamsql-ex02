/**
 * 
 */
package com.ex02.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex02.c4.dao.IClientDAO;
import com.ex02.c4.dto.Client;

/**
 * @author elena-01
 *
 */

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	IClientDAO iClientDAO;

	// READ: list with all Clients
	public List<Client> listClients() {

		return iClientDAO.findAll();
	}

	// CREATE: an Client
	public Client saveClient(Client client) {

		return iClientDAO.save(client);
	}

	// READ: Clients by id
	public Client getClientById(int id) {

		return iClientDAO.findById(id).get();
	}

	// UPDATE: Client
	public Client updateClient(Client client) {

		return iClientDAO.save(client);
	}

	// DELETE: Client
	public void deleteClient(int id) {

		iClientDAO.deleteById(id);
	}

}

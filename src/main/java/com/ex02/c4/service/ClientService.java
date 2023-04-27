/**
 * 
 */
package com.ex02.c4.service;

import java.util.List;

import com.ex02.c4.dto.Client;

/**
 * @author elena-01
 *
 */
public interface ClientService {
	
	//Methods CRUD forn Client
	public List<Client> listClients();//READ: list with all Clients

	public Client saveClient(Client client);//CREATE: an Client

	public Client getClientById(int id);//READ: Clients by id

	public Client updateClient(Client client);//UPDATE: Client

	public void deleteClient(int id);//DELETE: Client
}

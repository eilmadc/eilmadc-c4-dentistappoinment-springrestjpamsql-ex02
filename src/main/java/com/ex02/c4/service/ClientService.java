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
	public List<Client> listClients();

	public Client saveClient(Client client);

	public Client getClientById(int id);

	public Client updateClient(Client client);

	public void deleteClient(int id);
}

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
public class ClientServiceImpl implements ClientService{

	@Autowired
	IClientDAO iClientDAO;
	
	public List<Client> listClients() {
		// TODO Auto-generated method stub
		return iClientDAO.findAll();
	}

	public Client saveClient(Client client) {
		// TODO Auto-generated method stub
		return iClientDAO.save(client);
	}

	public Client getClientById(int id) {
		// TODO Auto-generated method stub
		return iClientDAO.findById(id).get();
	}

	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return iClientDAO.save(client);
	}

	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		iClientDAO.deleteById(id);
	}


}

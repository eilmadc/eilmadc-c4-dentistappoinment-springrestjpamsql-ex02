/**
 * 
 */
package com.ex02.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex02.c4.dao.IDentistDAO;
import com.ex02.c4.dto.Dentist;

/**
 * @author elena-01
 *
 */

@Service
public class DentistServiceImpl implements DentistService {

	@Autowired
	IDentistDAO iDentistDAO;

	//Get:All Destists
	public List<Dentist> listDentists() {

		return iDentistDAO.findAll();
	}

	//Post: Save new Dentist
	public Dentist saveDentist(Dentist dentist) {

		return iDentistDAO.save(dentist);
	}	

	// Get Dentist By ID
	public Dentist getDentistById(int id) {

		return iDentistDAO.findById(id).get();
	}

	//Put Dentist By ID
	@Override
	public Dentist updateDentist(Dentist dentist) {
		// TODO Auto-generated method stub
		return iDentistDAO.save(dentist);
	}
	
	// Delete Dentist
	public void deleteDentist(int id) {

		iDentistDAO.deleteById(id);
	}


}

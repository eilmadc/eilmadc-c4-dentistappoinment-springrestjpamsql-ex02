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

	public List<Dentist> listDentists() {

		return iDentistDAO.findAll();
	}

	public Dentist saveDentist(Dentist dentist) {

		return iDentistDAO.save(dentist);
	}	

	// Get Dentist By ID
	public Dentist getDentistById(int id) {

		return iDentistDAO.findById(id).get();
	}

	// Delete Dentist
	public void deleteDentist(int id) {

		iDentistDAO.deleteById(id);
	}

}

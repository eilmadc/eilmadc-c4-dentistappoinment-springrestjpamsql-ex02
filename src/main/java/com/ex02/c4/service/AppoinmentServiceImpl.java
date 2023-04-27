/**
 * 
 */
package com.ex02.c4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex02.c4.dao.IAppoinmentDAO;
import com.ex02.c4.dto.Appoinment;

/**
 * @author elena-01
 *
 */

@Service
public class AppoinmentServiceImpl implements AppoinmentService{

	@Autowired
	IAppoinmentDAO iAppoinmentDAO;

	//------------Methods CRUD---------
	//READ: list with all appoinments
	@Override
	public List<Appoinment> listAppoinments() {
		
		return iAppoinmentDAO.findAll();
	}

	//CREATE: an appoinment
	@Override
	public Appoinment saveAppoinment(Appoinment appoinment) {
		
		return iAppoinmentDAO.save(appoinment);
	}

	//READ: Appointments by id
	@Override
	public Appoinment getAppoinmentById(int id) {
		
		return iAppoinmentDAO.findById(id).get();
	}

	//UPDATE: appoinment
	@Override
	public Appoinment updateAppoinment(Appoinment appoinment) {
		
		return iAppoinmentDAO.save(appoinment);
	}

	//DELETE: Appoinment
	@Override
	public void deleteAppoinment(int id) {
		
		iAppoinmentDAO.deleteById(id);
	}

	//READ: Get all appoinments by dentist id
	@Override
	public List<Appoinment> listAppoinmentsByDentistId(int id) {
		
		return iAppoinmentDAO.findAllByDentistId(id);
	}

	//READ: Get all appoinments by client id
	@Override
	public List<Appoinment> listAppoinmentsByClientId(int id) {
		
		return iAppoinmentDAO.findAllByClientId(id);
	}

}

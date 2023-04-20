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

	@Override
	public List<Appoinment> listAppoinments() {
		// TODO Auto-generated method stub
		return iAppoinmentDAO.findAll();
	}

	@Override
	public Appoinment saveAppoinment(Appoinment appoinment) {
		// TODO Auto-generated method stub
		return iAppoinmentDAO.save(appoinment);
	}

	@Override
	public Appoinment getAppoinmentById(int id) {
		// TODO Auto-generated method stub
		return iAppoinmentDAO.findById(id).get();
	}

	@Override
	public Appoinment updateAppoinment(Appoinment appoinment) {
		// TODO Auto-generated method stub
		return iAppoinmentDAO.save(appoinment);
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		iAppoinmentDAO.deleteById(id);
	}

}

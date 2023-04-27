/**
 * 
 */
package com.ex02.c4.service;

import java.util.List;

import com.ex02.c4.dto.Appoinment;

/**
 * @author elena-01
 *
 */

//Methods CRUD
public interface AppoinmentService {

	public List<Appoinment> listAppoinments();
	
	public List<Appoinment> listAppoinmentsByDentist(int i);
	
	public List<Appoinment> listAppoinmentsByClient(int i);

	public Appoinment saveAppoinment(Appoinment appoinment);

	public Appoinment getAppoinmentById(int id);

	public Appoinment updateAppoinment(Appoinment appoinment);

	void deleteClient(int id);

}

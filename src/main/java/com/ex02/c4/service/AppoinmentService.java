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

public interface AppoinmentService {

	//Methods CRUD for Appoinment
	public List<Appoinment> listAppoinments(); //READ: list with all appoinments

	public Appoinment saveAppoinment(Appoinment appoinment);//CREATE: an appoinment

	public Appoinment getAppoinmentById(int id); //READ: Appointments by id

	public Appoinment updateAppoinment(Appoinment appoinment); //UPDATE: appoinment

	public void deleteAppoinment(int id);//DELETE: Appoinment

	public List<Appoinment> listAppoinmentsByDentistId(int id); //READ: Get all Appoinments for an Dentist by Id

	public List<Appoinment> listAppoinmentsByClientId(int id);//READ: Get all Appoinments for an Client by Id


}

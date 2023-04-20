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

	Appoinment saveAppoinment(Appoinment appoinment);

	Appoinment getAppoinmentById(int id);

	Appoinment updateAppoinment(Appoinment appoinment);

	void deleteClient(int id);

}

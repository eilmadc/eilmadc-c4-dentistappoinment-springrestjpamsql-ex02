/**
 * 
 */
package com.ex02.c4.service;

import java.util.List;

import com.ex02.c4.dto.Dentist;

/**
 * @author elena-01
 *
 */
public interface DentistService {
	
	//Methods CRUD for Dentist
	public List<Dentist> listDentists();//READ: list with all Dentists

	public Dentist saveDentist(Dentist dentist);//CREATE: an Dentist

	public Dentist getDentistById(int id);//READ: Dentists by id

	public Dentist updateDentist(Dentist dentist);//UPDATE: Dentist

	public void deleteDentist(int id);//DELETE: Client
}

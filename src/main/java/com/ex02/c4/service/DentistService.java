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
	public List<Dentist> listDentists();

	public Dentist saveDentist(Dentist dentist);

	public Dentist getDentistById(int id);

	public Dentist updateDentist(Dentist dentist);

	public void deleteDentist(int id);
}

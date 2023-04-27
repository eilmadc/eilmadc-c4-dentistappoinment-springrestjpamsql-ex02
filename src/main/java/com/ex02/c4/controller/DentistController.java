/**
 * 
 */
package com.ex02.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex02.c4.dto.Dentist;
import com.ex02.c4.service.DentistServiceImpl;


/**
 * @author elena-01
 *
 */
@RestController
@RequestMapping("/api")
public class DentistController {

	@Autowired
	DentistServiceImpl dentistServiceImpl;
	
	//List of all Dentists
	@GetMapping("/dentists")
	public List<Dentist> listDentists(){
		return dentistServiceImpl.listDentists();
	}
	
	//Create a Dentist
	@PostMapping("/dentists")
	public Dentist saveDentist(@RequestBody Dentist dentist) {
		
		return dentistServiceImpl.saveDentist(dentist);
	}
	
	//Get Dentist By ID
	@GetMapping("/dentists/{id}")
	public Dentist getDentistById(@PathVariable(name="id") int id) {

		
		return dentistServiceImpl.getDentistById(id);
	}
	
	//Update a Dentist
	@PutMapping ("/dentists/{id}")
	public Dentist udpateDentist(@PathVariable(name="id") int id, @RequestBody Dentist dentist) {
		Dentist dentist_selected = new Dentist();

		dentist_selected = dentistServiceImpl.getDentistById(id);
		
		dentist_selected.setName(dentist.getName());
		dentist_selected.setLastname(dentist.getLastname());
		dentist_selected.setAddress(dentist.getAddress());
		dentist_selected.setEmail(dentist.getEmail());
		dentist_selected.setUsername(dentist.getUsername());
		dentist_selected.setPassword(dentist.getPassword());

		return dentistServiceImpl.updateDentist(dentist_selected);

	}
	
	
	//Delete Dentist
	public void deleteDentist(@PathVariable(name="id") int id) {
		dentistServiceImpl.deleteDentist(id);
	}
}

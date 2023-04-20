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
		return DentistServiceImpl.listDentists();
	}
	
	//Create a Dentist
	@PostMapping("/dentists")
	public Dentist saveDentist(@RequestBody Dentist dentist) {
		
		return dentistServiceImpl.saveDentist(dentist);
	}
	
	//Get Dentist By ID
	@GetMapping("/dentist/{id}")
	public Dentist getDentistById(@PathVariable(name="id") int id) {
		
		Dentist dentist_bid= new Dentist();
		
		dentist_bid=dentistServiceImpl.getDentistById(id);
		
		System.out.println("Dentist By ID: "+dentist_bid);
		
		return dentist_bid;
	}
	
	//Update Dentist
	@PutMapping ("/dentist/{id}")
	public Dentist udpateDentist(@PathVariable(name="id") int id) {
		Dentist dentist_bid = new Dentist();
		dentist_bid = dentistServiceImpl.getDentistById(id);
		System.out.println("Dentist XID:"+dentist_bid);
		return dentist_bid;
	}
	
	
	//Delete Dentist
	public void deleteDentist(@PathVariable(name="id") int id) {
		dentistServiceImpl.deleteDentist(id);
	}
}

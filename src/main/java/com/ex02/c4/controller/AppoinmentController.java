/**
 * 
 */
package com.ex02.c4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex02.c4.dto.Appoinment;
import com.ex02.c4.service.AppoinmentServiceImpl;

/**
 * @author elena-01
 *
 */

@RestController
@RequestMapping("/api")
public class AppoinmentController {

	@Autowired
	AppoinmentServiceImpl appoinmentServiceImpl;

	// GET: List of all appoinments
	@GetMapping("/appoinments")
	public List<Appoinment> listAppoinments() {
		return appoinmentServiceImpl.listAppoinments();
	}
	

	// GET: List of all appoinments as a dentist
	@GetMapping("/appoinments/dentists/{dentist_id}")
	public List<Appoinment> listAppoinmentsAsDentist(@PathVariable(name="dentist_id") int id) {
		return appoinmentServiceImpl.listAppoinmentsByDentistId(id);
	}
	
	// GET: List of all appoinments as a dentist
	@GetMapping("/appoinments/clients/{client_id}")
	public List<Appoinment> listAppoinmentsAsClient(@PathVariable(name="client_id") int id) {
		return appoinmentServiceImpl.listAppoinmentsByClientId(id);
	}
	
	// POST: Create a new appoinment
	@PostMapping("/appoinments")
	public Appoinment saveAppoinment(@RequestBody Appoinment appoinment) {
		return appoinmentServiceImpl.saveAppoinment(appoinment);
	}

	// GET: an appoinment by id
	@GetMapping("/appoinments/{id}")
	public Appoinment getAppoinmentById(@PathVariable(name = "id") int id) {

		return appoinmentServiceImpl.getAppoinmentById(id);
	}

	// PUT: an appoinment by id
	@PutMapping("/appoinments/{id}")
	public Appoinment updateAppoinment(@PathVariable(name = "id") int id, @RequestBody Appoinment appoinment) {
		Appoinment appoinment_selected = new Appoinment();

		appoinment_selected = appoinmentServiceImpl.getAppoinmentById(id);
		
		appoinment_selected.setDate_appoinment(appoinment.getDate_appoinment());
		appoinment_selected.setDescription(appoinment.getDescription());
		appoinment_selected.setStatus(appoinment.getStatus());
		appoinment_selected.setDentist(appoinment.getDentist());
		appoinment_selected.setClient(appoinment.getClient());

		return appoinmentServiceImpl.updateAppoinment(appoinment_selected);

	}
	
	//DELETE: delete an appoinment
	@DeleteMapping("/appoinments/{id}")
	public void deleteAppointment(@PathVariable(name="id") int id) {
		appoinmentServiceImpl.deleteAppoinment(id);
	}
}

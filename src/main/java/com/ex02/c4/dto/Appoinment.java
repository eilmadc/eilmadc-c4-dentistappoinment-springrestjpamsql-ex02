/**
 * 
 */
package com.ex02.c4.dto;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * @author elena-01
 *
 */
@Entity
@Table(name = "appoinments")
public class Appoinment {

	// ------------------Atributes-----------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	//@Column(name = "date_appoinment")
	private Date date_appoinment;

	@Column(name = "status")
	private String status;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "client_id")
	Client client;

	@ManyToOne
	@JoinColumn(name = "dentist_id")
	Dentist dentist;

	// ------------------Constructors-----------------------

	public Appoinment() {

	}

	/**
	 * @param id
	 * @param date_appoinment
	 * @param client
	 * @param dentist
	 */
	public Appoinment(int id, Date date_appoinment, Client client, Dentist dentist) {
		super();
		this.id = id;
		this.date_appoinment = date_appoinment;
		this.client = client;
		this.dentist = dentist;
	}

	// ------------------Getters and Setters-----------------------

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the date_appoinment
	 */
	public Date getDate_appoinment() {
		return date_appoinment;
	}

	/**
	 * @param date_appoinment the date_appoinment to set
	 */
	public void setDate_appoinment(Date date_appoinment) {
		
		this.date_appoinment = date_appoinment;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the dentist
	 */
	public Dentist getDentist() {
		return dentist;
	}

	/**
	 * @param dentist the dentist to set
	 */
	public void setDentist(Dentist dentist) {
		this.dentist = dentist;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	// ------------------Methods-----------------------
	@Override
	public String toString() {
		return "Appoinment [id=" + id + ", date_appoinment=" + date_appoinment + ", client=" + client + ", dentist="
				+ dentist + "]";
	}

}

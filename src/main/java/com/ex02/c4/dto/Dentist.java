/**
 * 
 */
package com.ex02.c4.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/**
 * @author elena-01
 *
 */

@Entity
@Table(name = "dentists")
public class Dentist {

	// ------------------Atributes-----------------------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "address")
	private String address;
	@Column(name = "email")
	private String email;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_up;
	
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<Appoinment> appoinment;

	// ------------------Constructors-----------------------

	public Dentist() {

	}

	/**
	 * @param id
	 * @param name
	 * @param lastname
	 * @param address
	 * @param email
	 * @param username
	 * @param password
	 * @param appoinment
	 * @param date_up
	 */
	public Dentist(int id, String name, String lastname, String address, String email, String username, String password,Date date_up,
			List<Appoinment> appoinment) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.email = email;
		this.username = username;
		this.password = password;
		this.date_up= date_up;
		this.appoinment = appoinment;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the appoinment
	 */
	public List<Appoinment> getAppoinment() {
		return appoinment;
	}

	/**
	 * @param appoinment the appoinment to set
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Appoinment")
	public void setAppoinment(List<Appoinment> appoinment) {
		this.appoinment = appoinment;
	}

		
	/**
	 * @return the date_up
	 */
	public Date getDate_up() {
		return date_up;
	}

	/**
	 * @param date_up the date_up to set
	 */
	public void setDate_up(Date date_up) {
		this.date_up = date_up;
	}


	// ------------------Methods-----------------------
	@Override
	public String toString() {
		return "Dentist [id=" + id + ", name=" + name + ", lastname=" + lastname + ", address=" + address + ", email="
				+ email + ", username=" + username + ", password=" + password + ", date_up=" + date_up + ", appoinment="
				+ appoinment + "]";
	}

}

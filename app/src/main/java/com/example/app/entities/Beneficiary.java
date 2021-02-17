package com.example.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Beneficiaries")
public class Beneficiary {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	private String username;
	private String city;
	private String state;
	private String zip;

	public Beneficiary(){}

	public Beneficiary(
		long id,
		String firstName,
		String lastName,
		String username,
		String city,
		String state,
		String zip
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}


	public String getLastName() {
		return this.lastName;
	}


	public String getUsername() {
		return this.username;
	}


	public String getCity() {
		return this.city;
	}


	public String getState() {
		return this.state;
	}


	public String getZip() {
		return this.zip;
	}
}

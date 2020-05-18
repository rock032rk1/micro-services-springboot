package com.hospitality.api.model;

public class Employee {

	private String Id;
	private String firstname;
	private String lastname;
	private String specality;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String firstname, String lastname, String specality) {
		super();
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.specality = specality;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSpecality() {
		return specality;
	}

	public void setSpecality(String specality) {
		this.specality = specality;
	}
	
	
}

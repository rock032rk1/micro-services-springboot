package com.hospitality.api.model;

public class Disease {

	private String Id;
	private String discription;
	private String treatment;
	
	public Disease() {
		// TODO Auto-generated constructor stub
	}

	public Disease(String id, String discription, String treatment) {
		super();
		Id = id;
		this.discription = discription;
		this.treatment = treatment;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	
	
}

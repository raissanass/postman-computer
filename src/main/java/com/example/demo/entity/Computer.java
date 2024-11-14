package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Computer {
	@Id
	int id;
	String serialNumber;
    String model;
    String releaseDate;
	boolean status;
	
	public Computer() {
		super();
	}
	@Override
	public String toString() {
		return "Computer [id=" + id + ", serialNumber=" + serialNumber + ", model=" + model + ", releaseDate="
				+ releaseDate + ", status=" + status + "]";
	}

	public Computer(int id, String serialNumber, String model, String releaseDate, boolean status) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.model = model;
		this.releaseDate = releaseDate;
		this.status = status;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	


}

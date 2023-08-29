package com.skill.hibernate.Hibernate_01;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Data {
	@Id
	private int ID;
	private String name;
	private String Location;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

}

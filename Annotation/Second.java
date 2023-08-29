package com.skill.hibernate.Annotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity 
@Table(name="saturday") // if the table name is different in the data base 
public class Second {
	@Id
	// To initiate the primary key in the table 
	
	
private int ID;
	
private String Name;
private String Address;
private int Age;




public int getID() {
	return ID;
	
	
}

public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}












}

package com.skill.hibernate.FirstLevelCache;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class School {
	
	@Id
	private int ID;
	private String name;
	private String subject;
	private int age;
	
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "School [ID=" + ID + ", name=" + name + ", subject=" + subject + ", age=" + age + "]";
	}
	
	
	

}

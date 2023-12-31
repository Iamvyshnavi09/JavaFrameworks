package com.skill.hibernate.FirstHQLApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Details")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private int rollno;
private int marks;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
}


}

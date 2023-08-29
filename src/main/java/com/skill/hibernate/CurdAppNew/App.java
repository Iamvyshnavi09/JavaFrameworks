package com.skill.hibernate.CurdAppNew;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hello world!
 *
 */
@Entity
@Table(name="college")
public class App 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Ref_ID;
	private String department;
	private String subject;
	private int salary;


	public int getRef_ID() {
		return Ref_ID;
	}
	public void setRef_ID(int ref_ID) {
		Ref_ID = ref_ID;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Create [Ref_ID=" + Ref_ID + ", department=" + department + ", subject=" + subject + ", salary=" + salary
				+ "]";
	}


}

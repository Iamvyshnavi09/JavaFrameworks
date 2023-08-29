package com.skill.hibernate.JpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sample {
	private int id;
	private String pname;
	private int cost;
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Sample [id=" + id + ", pname=" + pname + ", cost=" + cost + "]";
	}
	

}

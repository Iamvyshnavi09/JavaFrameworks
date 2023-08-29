package com.skill.hibernate.GetLoad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rent")
public class Beta {
private int Id;
private String name;
private int rent;


@Id
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRent() {
	return rent;
}
public void setRent(int rent) {
	this.rent = rent;
}
@Override
public String toString() {
	return "Beta [Id=" + Id + ", name=" + name + ", rent=" + rent + "]";
}



}

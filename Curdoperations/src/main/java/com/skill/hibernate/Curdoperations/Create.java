package com.skill.hibernate.Curdoperations;

import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.controller.Animal;



public class Create {
public static void main(String[] args) {
	
	Configuration con = new Configuration();
	con.configure("Animal.cfg.xml");
	
	con.addAnnotatedClass(Animal.class);
	//creating Session Factory(interface) 
	SessionFactory sf = con.buildSessionFactory();
	
	//creating the session object
	Session session = sf.openSession();
    Animal A = new Animal();
  
  A.setName("Fishes");
  A.setCost(200);
  A.setAid(99);
  
  
  session.beginTransaction();
  // Before saving of every object we need Begin transaction and commit 
  session.save(A);
  session.getTransaction().commit();
  System.out.println("Data is create ..check DB");
  session.close();
  
   
   
}
}

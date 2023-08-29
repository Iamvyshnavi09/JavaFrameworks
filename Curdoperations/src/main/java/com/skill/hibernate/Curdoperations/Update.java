package com.skill.hibernate.Curdoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.controller.Animal;

public class Update {
	
	public static void main(String[] args) {
		
	
	Configuration con = new Configuration();
	con.configure("Animal.cfg.xml");
	
	con.addAnnotatedClass(Animal.class);
	//creating Session Factory(interface) 
	SessionFactory sf = con.buildSessionFactory();
	
	//creating the session object
	Session session = sf.openSession();
    Animal A = new Animal();
  
  A.setName("Rats");
  A.setCost(80);
  A.setAid(85452);
  
  
  session.beginTransaction();
  // Before saving of every object we need Begin transaction and commit 
  session.save(A);
  session.getTransaction().commit();
  System.out.println("Data is updated..check DB");
  
  session.close();
 
	}
  
}

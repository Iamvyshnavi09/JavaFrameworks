package com.skill.hibernate.Curdoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.controller.Animal;

public class Retriev {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("Animal.cfg.xml");
		con.addAnnotatedClass(Animal.class);
		
		//creating Session Factory(interface) 
		SessionFactory sf = con.buildSessionFactory();
		
		//creating the session object
		Session session = sf.openSession();
	    Animal A = session.get(Animal.class, 3);
	  
	    System.out.println("AId : "+A.getId());
        System.out.println("PetName : "+A.getName());
        System.out.println("PetCost : " + A.getCost());
        
	  session.beginTransaction();
	  // Before saving of every object we need Begin transaction and commit 
	 
	  session.getTransaction().commit();
	  System.out.println("Data is Retrieve..From Petstore");
	  
	  session.close();

	}

}

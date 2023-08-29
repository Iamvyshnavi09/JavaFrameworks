package com.skill.hibernate.Curdoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.controller.Animal;

public class RetrieveAPP {
	public static void main(String[] args) {
		
	
	Configuration con = new Configuration();
	con.configure("Animal.cfg.xml");
	
	con.addAnnotatedClass(Animal.class);
	//creating Session Factory(interface) 
	SessionFactory sf = con.buildSessionFactory();
	
	//creating the session object
	Session session = sf.openSession();
	
	System.out.println("Fetching object using get:");
    Animal s1=session.get(Animal.class, 2);
    System.out.println(s1);
    System.out.println("Fetching object using load:");
    Animal s2=session.load(Animal.class,2);
    System.out.println(s2);
      
    session.close();
	
	
	}
	
}

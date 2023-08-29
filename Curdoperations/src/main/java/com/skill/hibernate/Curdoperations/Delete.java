package com.skill.hibernate.Curdoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.controller.Animal;

public class Delete {
public static void main(String[] args) {
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	
	con.addAnnotatedClass(Animal.class);
	//creating Session Factory(interface) 
	SessionFactory sf = con.buildSessionFactory();
	
	//creating the session object
	Session session = sf.openSession();
	Transaction t=session.beginTransaction();
    
    Animal s=session.get(Animal.class, 1);
    session.delete(s);
    t.commit();
    System.out.println("Delete the row in Petstore ...check in DB");
}
}

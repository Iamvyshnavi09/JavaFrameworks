package com.vyshu.contoller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.skill.hibernate.CurdAppNew.App;

public class Update {
	
	public static void main(String[] args) {
		
	
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	
	con.addAnnotatedClass(App.class);
	//creating Session Factory(interface) 
	SessionFactory sf = con.buildSessionFactory();
	
	//creating the session object
	Session session = sf.openSession();
    App A = new App();
  A.setDepartment("Aeronotical");
  A.setSalary(100000);
  A.setSubject("Fluid and Mechanics");
  
  
  session.beginTransaction();
  // Before saving of every object we need Begin transaction and commit 
  session.save(A);
  session.getTransaction().commit();
  System.out.println("Data is updated..check DB");
  
  session.close();
 
	}
  
}

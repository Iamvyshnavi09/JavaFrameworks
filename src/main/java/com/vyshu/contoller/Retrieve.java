package com.vyshu.contoller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.skill.hibernate.CurdAppNew.App;

public class Retrieve {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(App.class);
		
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		App A = session.get(App.class, 2);
		 System.out.println("Reference ID : "+A.getRef_ID());
	        System.out.println("Department : "+A.getDepartment());
	        System.out.println("Subject : " + A.getSubject());
	        System.out.println("Salary : "+A.getSalary());
	        session.beginTransaction();
	        session.getTransaction().commit();
	  	  System.out.println("Data is Retrieve..From College");
	  	  
	  	  session.close();
	}
	
	
}

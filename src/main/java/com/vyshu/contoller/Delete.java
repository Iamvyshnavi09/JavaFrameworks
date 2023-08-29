package com.vyshu.contoller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.skill.hibernate.CurdAppNew.App;

public class Delete {
public static void main(String[] args) {
	Configuration con = new Configuration();
	con.configure("hibernate.cfg.xml");
	
	con.addAnnotatedClass(App.class);
	//creating Session Factory(interface) 
	SessionFactory sf = con.buildSessionFactory();
	Session session = sf.openSession();
	Transaction t=session.beginTransaction();
    
    App s=session.get(App.class, 1);
    session.delete(s);
    t.commit();
    System.out.println("Delete the row in college ...check in DB");

	
  session.close();
}
}

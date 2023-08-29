package com.skill.hibernate.Hibernate_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    
    	// creating  configuration (class)
    	Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(Data.class);
    	//creating Session Factory(interface) 
    	SessionFactory sf = con.buildSessionFactory();
    	
    	//creating the session object
    	Session session = sf.openSession();
        Data d = new Data();
        d.setID(5);
        d.setName("Maya");
        d.setLocation("Hyderbad");
        session.beginTransaction(); // Before saving of every object we need Begin transaction and commit 
        session.save(d);
        session.getTransaction().commit();
        System.out.println("Data is Saved..check DB");
        session.close();
        
    }
}

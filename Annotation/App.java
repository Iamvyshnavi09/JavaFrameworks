package com.skill.hibernate.Annotation;

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
    	
    	Configuration config = new Configuration();  
    	config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Second.class);
    	
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
        Session session = sf.openSession();
        Second s = new Second();
        s.setName("karhik");
        s.setAddress("Sagar");
        s.setAge(25);
        session.beginTransaction(); 
        session.save(s);
        session.getTransaction().commit();
        session.close();
        System.out.println("Check data base data is updated..");
      
 
    }
}

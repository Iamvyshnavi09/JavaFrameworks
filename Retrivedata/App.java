package com.skill.hibernate.Retrivedata;

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
    	config.configure("employee.cfg.xml");
		config.addAnnotatedClass(Retrieve.class);
    	
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
        Session session = sf.openSession();
        //Retrieve R = new Retrieve();
        Retrieve R = null;
        session.beginTransaction(); 
        R = (Retrieve)session.get(Retrieve.class, 2);
        session.getTransaction().commit();
        session.close();
        
       //  System.out.println(R);    // we get the zeros and null values
        
        System.out.println(R);
    }
}

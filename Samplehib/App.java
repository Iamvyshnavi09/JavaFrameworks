package com.skill.Samplehib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Sample std = new Sample();
    	std.setId(90);
    	std.setName("vaishnavi");
    	std.setLocation("chennai");
    	
   
		Configuration config = new Configuration().configure().addAnnotatedClass(Sample.class);

		SessionFactory sf = config.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(std);
		tx.commit(); 
        
    }
}

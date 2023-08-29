package com.skill.hibernate.GetLoad;

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
    	Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        con.addAnnotatedClass(Beta.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
       Beta B = new Beta() ;
        B.setName("maya");
        B.setRent(5000);
        B.setId(12);
        session.save(B);
        
       // session.load(Beta.class, 12);  // load is used means we dont give object only provide proxy object// provide exception
        session.get(Beta.class, 12);  // get will give exact object // it will give null if not have in DB
        System.out.println(B);
        session.getTransaction().commit();
        
        	
        
       
        
    }
}

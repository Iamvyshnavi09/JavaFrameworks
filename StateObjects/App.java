package com.skill.hibernate.StateObjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        con.addAnnotatedClass(Alpha.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        // creating the object in the data base 
        Alpha A = new Alpha();
        A.setId(12);
        A.setMarks(100);
        A.setName("karthik");
        A.setSubject("Spring boot");
        session.save(A);
        System.out.println("This data is stores in the database");
        //presisent state object
        A.setName("maya");
        
        //remove state
        session.remove(A);
        
        //detached state
        session.getTransaction().commit();
        session.detach(A);
        A.setName("Joshi");
        
        
    }
}

package com.skill.hibernate.FirstLevelCache;

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
     School s = null;
    // creating  configuration (class)
   	Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(School.class);
   	//creating Session Factory(interface) 
   	SessionFactory sf = con.buildSessionFactory();
   	
   	//creating the session object
   	Session session1 = sf.openSession();
   session1.beginTransaction();
   //	System.out.println(a);
   	
   	/*School s = new School();
   s.setID(101);
   s.setName("Maya");
   s.setAge(29);
   s.setSubject("JDBC");*/
   	
   s = (School)session1.get(School.class, 10);
 
   System.out.println(s); 
   
   s = (School)session1.get(School.class, 10);
   
   System.out.println(s);
   session1.getTransaction().commit();
   //System.out.println("School data  is Saved..check DB");
   session1.close();
   		
   	
   	
    }
}

package com.skill.hibernate.SecondLevelCache;

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
    	Shop A = null;
    	Configuration con = new Configuration();
    	con.configure("hibernate.cfg.xml");
    	
    	con.addAnnotatedClass(Shop.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	Session session1 = sf.openSession();
    	   session1.beginTransaction();
    	   
    	//creating the session object
    	/*Session session = sf.openSession();
        Shop A = new Shop();
      
      A.setNum(958);
      A.setCost(150);
      A.setProduct(" pens");
      A.setQuantity("1 box");
      
      */
      
      // Before saving of every object we need Begin transaction and commit 
      A = (Shop)session1.get(Shop.class, 655);
      System.out.println(A);
     
      session1.getTransaction().commit();
      session1.close();
      //Second level cache
      
      Session session2 = sf.openSession();
      session2.beginTransaction();
	   A = (Shop)session2.get(Shop.class, 655);
	      System.out.println(A);
      
      session2.getTransaction().commit();
      //System.out.println("Data is create ..check DB");
      session2.close();
     
     
     // We can able to write the Query using this data in the session 1 and session 2 ( We need to do  again )
     
    }
}

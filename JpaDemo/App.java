package com.skill.hibernate.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Sample s = new Sample();
    	s.setCost(958);
    	s.setId(99);
    	s.setPname("Blue tea");
    	
    	
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
       EntityManager em = emf.createEntityManager();
     // TO fetch the data we use find method ---  Sample s = em.find(Sample.class, 785);
       
       em.getTransaction().begin();
       em.persist(s);
       em.getTransaction().commit();
       System.out.println(s);
    }
}

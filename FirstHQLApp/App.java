package com.skill.hibernate.FirstHQLApp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App 
{
    public static void main( String[] args )
    {
       Configuration con = new Configuration();
       con.configure("hibernate.cfg.xml");
       con.addAnnotatedClass(Student.class);
       SessionFactory sf = con.buildSessionFactory();
       Session session = sf.openSession();
       session.beginTransaction();
       /* this is for creating data less than or equal to 20
       Random r = new Random();
       for(int i=0;i<=20;i++) {
    	   Student s = new Student();
    	   s.setRollno(i);
    	   s.setName("Name"+ i);
    	   s.setMarks(r.nextInt(100));
    	   session.save(s);
    	   
       }*/
       // creating the query
      // Query q  = session.createQuery("from Student where id>12");
      // Query q  = session.createQuery("from Student where id = 12");
              // List<Student> student = q.list();
       //Student student = (Student)q.uniqueResult(); - if you know only one object is displayed
       
     /*  for(Student s :student) {
    	   System.out.println(s);
       }
       *//*This for onr student the query
       Query q  = session.createQuery("select id,marks,name,rollno from Student where rollno=3");
       Object[] student = (Object[])q.uniqueResult();
       
      System.out.println(student[0]+":"+student[1]+":"+student[2]);
               System.out.println(student);*/
       
       /*The list students we need to get 
       Query q  = session.createQuery("select id,marks,name,rollno from Student");
       List<Object[]> students = (List<Object[]>)q.list();
       for(Object[] student : students)
    	   System.out.println(student[0]+":"+student[1]+":"+student[2]);
       /*If we need to print grater than 90
        * 
        */
       //Query q  = session.createQuery("select sum(marks) from Student s where s.marks>30");
       /* using prepared statement in jdbc here we use ":" to assign the variable*/
       int b=30; 
       
       Query q  = session.createQuery("select sum(marks) from Student s where s.marks > :b");
       q.setParameter("b", b);
       Long marks = (Long)q.uniqueResult();
       
       
       System.out.println(marks);
       
       System.out.println("This data is stores in the database");
       
       session.getTransaction().commit();
       
    }
}

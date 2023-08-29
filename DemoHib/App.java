package com.skill.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class App {
	public static void main(String[] args) {
		Demo std = new Demo();
		std.setId(95);
		std.setName("vaishnavi");
		std.setLocation("Chennai");

		Configuration config = new Configuration().configure().addAnnotatedClass(App.class);
		SessionFactory sf = config.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		session.save(std);
		tx.commit();
	}
}

package com.hib.hibernate_crud;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qn.entity.Students;

public class App2 {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		session.beginTransaction();
		Students s=(Students)session.get(Students.class,1);
		System.out.println(s);
		session.getTransaction().commit();

	}
}

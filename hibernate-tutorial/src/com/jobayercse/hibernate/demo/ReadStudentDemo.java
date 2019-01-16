package com.jobayercse.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jobayercse.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			System.out.println("creating new student object: ");
			
			Student tempStudent = new Student("3rd1", "3rd1", "third1@gmail.com");
			
			session.beginTransaction();
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Generated ID" + tempStudent.getId());
			
			Student myStudent = session.get(Student.class, tempStudent.getId());
			
			System.out.println(myStudent);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}

	}

}

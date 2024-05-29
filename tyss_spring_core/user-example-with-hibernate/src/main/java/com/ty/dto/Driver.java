package com.ty.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		EntityManager em = (EntityManager) context.getBean("em");
		EntityTransaction et = (EntityTransaction) context.getBean("et");

//		Dao dao=new Dao();
//		dao.bookAccomadation();
//		dao.bookFlight();
//		

		Userrr u=(Userrr)context.getBean("userrr");
//		u.setName("xyz");
//		u.setEmail("xyz@gmaio.com");
//		u.setPassword("123");
//	
//		Accomadation a=(Accomadation)context.getBean("ac");
//		a.setName("pg");
//		a.setPrice(3553.33);
//		
//		List<Accomadation> accos=Arrays.asList(a);
//		u.setAccomadations(accos);
//
//		Flight f1=(Flight)context.getBean("fl");
//		f1.setName("air india");
//		
//		Flight f2=(Flight)context.getBean("fl");
//		f2.setName("quatar flights");
//
//		List<Flight> flights=Arrays.asList(f1,f2);
//		u.setFlights(flights);
//		
//		Flight f=(Flight)context.getBean("fl");
//		f.setName("IAL");
//		
//		em.find(Userrr.class, 5);
//		et.begin();
//		em.persist(f1);
//		em.persist(f2);
//		em.persist(a);
//		em.persist(u);
//		et.commit();

//		System.out.println("saved------!");

//		Userrr u1=em.find(Userrr.class, 8);
//		
//		Accomadation a1=em.find(Accomadation.class, 9);
//		
//		Flight f1=em.find(Flight.class, 11);
//		
//		u1.setAccomadations(Arrays.asList(a1));
//		u1.setFlights(Arrays.asList(f1));
//		
		et.begin();
		em.persist(u);
		et.commit();
		System.out.println("added");
	}

}

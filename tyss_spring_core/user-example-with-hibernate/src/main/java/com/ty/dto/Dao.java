package com.ty.dto;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Dao {
	ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
	EntityManager em = (EntityManager) context.getBean("em");
	EntityTransaction et = (EntityTransaction) context.getBean("et");

//	public Accomadation getAccomadations(int id) {
//		Accomadation a=(Accomadation)context.getBean("ac");
//		EntityManager em = (EntityManager) context.getBean("em");
//		Accomadation accomadation = em.find(Accomadation.class, id);
//		return accomadation;
//	}

	public void bookFlight() {
		Userrr u = em.find(Userrr.class, 1);
		Flight f = em.find(Flight.class, 1);

		if (u.getBalence() >= f.getPrice()) {
			List<Flight> flights = Arrays.asList(f);
			double remainingBalance = u.getBalence() - f.getPrice();
			u.setBalence(remainingBalance);
			et.begin();
			em.persist(u);
			et.commit();
			System.out.println("balance is " + u.getBalence());
			System.out.println("Flight booked successfully");

		} else
			System.out.println("Insufficient balance");
	}

	public void bookAccomadation() {
		Userrr u = em.find(Userrr.class, 1);
		Accomadation a = em.find(Accomadation.class, 1);

		if (u.getBalence() >= a.getPrice()) {
			List<Accomadation> accomadations = Arrays.asList(a);
			double remainingBalance = u.getBalence() - a.getPrice();
			u.setBalence(remainingBalance);
			et.begin();
			em.merge(u);
			et.commit();
			System.out.println("balance is " + u.getBalence());
			System.out.println("Accomadation booked successfully");

		} else
			System.out.println("Insufficient balance");
	}
}

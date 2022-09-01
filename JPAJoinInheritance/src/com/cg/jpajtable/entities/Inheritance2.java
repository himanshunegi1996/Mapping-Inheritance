package com.cg.jpajtable.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance2{
	public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	
	//create one employee
	Employee2 employee = new Employee2();
	employee.setName("Pratiksha");
	employee.setSalary(18000);
	em.persist(employee);
	
	//create one manager
//	Manager2 manager = new Manager2();
//	manager.setName("Ruchika");
//	manager.setSalary(140000);
//	manager.setDeptName("Sales");
//	em.persist(manager);
	
	
	
	em.getTransaction().commit();
	
	System.out.println("Added one employee and manager to database.");
	em.close();
	factory.close();

}
} 
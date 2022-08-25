package com.cg.jpatable.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Inheritance{
	public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	
	//create one employee
	Employee1 employee = new Employee1();
	employee.setName("Gopal");
	employee.setSalary(8000);
	em.persist(employee);
	
	//create one manager
	Manager1 manager = new Manager1();
	manager.setName("Madhuri");
	manager.setSalary(10000);
	manager.setDeptName("Marketing");
	em.persist(manager);
	
	
	
	em.getTransaction().commit();
	
	System.out.println("Added one employee and manager to database.");
	em.close();
	factory.close();

}
} 
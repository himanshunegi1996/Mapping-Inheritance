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
	employee.setName("Himanshu Negi");
	employee.setSalary(12000);
	em.persist(employee);
	
	//create one manager
	Manager1 manager = new Manager1();
	manager.setName("Awantika Maam");
	manager.setSalary(120000);
	manager.setDeptName("Mentor");
	em.persist(manager);
	
	
	
	em.getTransaction().commit();
	
	System.out.println("Added one employee and manager to database.");
	em.close();
	factory.close();

}
} 
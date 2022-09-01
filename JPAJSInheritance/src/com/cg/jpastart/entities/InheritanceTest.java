package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest{
	public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	
//	//create one employee
	Employee employee = new Employee();
	employee.setName("Himanshu");
	employee.setSalary(12000);
	em.persist(employee);
	
	//create one manager
//	Manager manager = new Manager();
//	manager.setName("Mahesh");
//	manager.setSalary(15000);
//	manager.setDepartmentName("networking");
//	em.persist(manager);
	
	
	
	em.getTransaction().commit();
	
	System.out.println("Added one employee and manager to database.");
	em.close();
	factory.close();

}
} 
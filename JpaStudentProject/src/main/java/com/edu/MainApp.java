package com.edu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");
	    EntityManager em=emf.createEntityManager();
	    
	   JpaStudent sob=em.find(JpaStudent.class,3);
	    System.out.println(sob);
	  
	    //insert
	    
	  JpaStudent ob=new JpaStudent();
	    ob.setSid(101);
	    ob.setSname("Pavi");
	    ob.setSCourse("Computer Science");
	    em.getTransaction().begin();
	   
	    em.persist(ob);
	   em.getTransaction().commit();

	}

}

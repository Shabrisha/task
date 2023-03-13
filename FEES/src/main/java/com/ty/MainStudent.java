package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainStudent {

public static void main(String[] args) {


EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("vikas");
EntityManager entitymanager=emfEntityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entitymanager.getTransaction();

StudentDetails studentDetails=new StudentDetails();

studentDetails.setId(101);
studentDetails.setStudentname("Shabarisha");
studentDetails.setFees(25000.0);
studentDetails.setTeachername("vidya");
studentDetails.setBalancefees(15000.0);
studentDetails.setDateofjoin("28-Jun-2022");

StudentDetails studentDetails1=new StudentDetails();
studentDetails1.setId(102);
studentDetails1.setStudentname("Sumanth");
studentDetails1.setFees(35000.0);
studentDetails1.setTeachername("Sushma");
studentDetails1.setBalancefees(10000.0);
studentDetails1.setDateofjoin("10-dec-2022");

StudentDetails studentDetails2=new StudentDetails();
studentDetails2.setId(103);
studentDetails2.setStudentname("Rakesh");
studentDetails2.setFees(80000.0);
studentDetails2.setTeachername("Mehnaz");
studentDetails2.setBalancefees(50000.0);
studentDetails2.setDateofjoin("18-Jul-2023");

StudentDetails studentDetails3=new StudentDetails();
studentDetails3.setId(104);
studentDetails3.setStudentname("Charan");
studentDetails3.setFees(70000.0);
studentDetails3.setTeachername("Sandeep");
studentDetails3.setBalancefees(25000.0);
studentDetails3.setDateofjoin("18-Mar-2023");

entityTransaction.begin();

entitymanager.persist(studentDetails);
entitymanager.persist(studentDetails1);
entitymanager.persist(studentDetails2);
entitymanager.persist(studentDetails3);


entityTransaction.commit();
}




}
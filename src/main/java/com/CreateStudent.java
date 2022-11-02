package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CreateStudent
{
     void create()
     {
         try {
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aman");
             EntityManager entityManager = entityManagerFactory.createEntityManager();
             entityManager.getTransaction().begin();
             Student student = new Student();
             System.out.println("Enter first name");
             student.setFirstName(bufferedReader.readLine());
             System.out.println("Enter Last name");
             student.setLastName(bufferedReader.readLine());
             entityManager.persist(student);
             entityManager.getTransaction().commit();
         }
         catch (Exception e)
         {
             e.printStackTrace();
         }

     }
        }


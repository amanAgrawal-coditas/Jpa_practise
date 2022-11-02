package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpdateStudent
{
    void update()
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aman");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            System.out.println("Enter the id you want to change for");
            Long id = Long.parseLong(bufferedReader.readLine());
            Student student = entityManager.find(Student.class, id);
            System.out.println("Before update" + student.toString());
            System.out.println("Enter new first name");
            student.setFirstName(bufferedReader.readLine());
            System.out.println("Enter last name");
            student.setLastName(bufferedReader.readLine());
            entityManager.persist(student);
            System.out.println("After update" + student.toString());
            entityManager.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }



    }
}

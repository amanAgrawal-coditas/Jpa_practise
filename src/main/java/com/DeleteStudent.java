package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteStudent
{
    void delete()
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aman");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();
            System.out.println("Enter the id you want to delete");
            Long id = Long.parseLong(bufferedReader.readLine());
            Student student = entityManager.find(Student.class, id);
            entityManager.remove(student);
            entityManager.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}

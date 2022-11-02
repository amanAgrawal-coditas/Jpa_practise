package bean;

import com.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentRepository
{
    static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("aman");
    static EntityManager entityManager= entityManagerFactory.createEntityManager();
    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

    public Student addStudent() throws IOException
    {
        entityManager.getTransaction().begin();
        Student student=new Student();
        System.out.println("Enter first name");
        String firstName= bufferedReader.readLine();
        student.setFirstName(firstName);
        System.out.println("Enter Last name ");
        String lastName=bufferedReader.readLine();
        student.setLastName(lastName);
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        return student;
    }
    public Student findStudent() throws IOException
    {
        System.out.println("Enter the id you want to look for");
        Long studId=Long.parseLong(bufferedReader.readLine());
        Student student=entityManager.find(Student.class,studId);
        System.out.println(student.toString());
        return student;
    }
    public Student updateStudent() throws IOException
    {
        System.out.println("Enter the id you want to update");
        Long id=Long.parseLong(bufferedReader.readLine());
        Student student=entityManager.find(Student.class,id);
        entityManager.getTransaction().begin();
        System.out.println("Enter first name");
        String fName=bufferedReader.readLine();
        student.setFirstName(fName);
        System.out.println("Enter last name");
        String lName=bufferedReader.readLine();
        student.setLastName(lName);
        entityManager.getTransaction().commit();
        return student;

    }
    public void deleteStudent() throws IOException {
        System.out.println("Enter the id you want to delete");
        Long id=Long.parseLong(bufferedReader.readLine());
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
        entityManager.getTransaction().commit();
    }


}

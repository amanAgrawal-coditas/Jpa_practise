package bean;

import com.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApplication
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        StudentRepository studentRepository=new StudentRepository();
        while (true)
        {
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to find student");
            System.out.println("Press 3 to Update student");
            System.out.println("Press 4 to Delete Student");
            System.out.println("Enter choice");
            int choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    studentRepository.addStudent();
                    break;
                }
                case 2: {
                    studentRepository.findStudent();
                    break;
                }
                case 3: {
                    studentRepository.updateStudent();
                    break;
                }
                case 4:
                {
                    studentRepository.deleteStudent();
                    break;
                }
                default: {
                    System.out.println("Enter valid choice");
                    break;
                }
            }
        }
    }
}

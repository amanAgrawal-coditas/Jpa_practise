package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainApplication
{

    public static void main(String[] args)
    {
        try
        {
            CreateStudent createStudent=new CreateStudent();
            UpdateStudent updateStudent=new UpdateStudent();
            FindStudent findStudent=new FindStudent();
            DeleteStudent deleteStudent=new DeleteStudent();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            boolean loop=true;
            while (loop)
         {
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to Update student");
            System.out.println("Press 3 to find student");
            System.out.println("Press 4 to Delete Student");
            System.out.println("Enter choice");
            int choice =Integer.parseInt(bufferedReader.readLine());
            switch (choice)
            {
                case 0:
                {
                    System.exit(0);
                    break;
                }
                case 1:
                {
                    createStudent.create();
                    break;
                }
                case 2:
                {
                    updateStudent.update();
                    break;
                }
                case 3:
                {
                    findStudent.find();
                    break;
                }
                case 4:
                {
                    deleteStudent.delete();
                    break;
                }
                default:
                {
                    System.out.println("Wrong input");
                }

            }
        }
    }
          catch (Exception e)
         {
            e.printStackTrace();
         }
}

}

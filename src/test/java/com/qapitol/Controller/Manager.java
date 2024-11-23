package com.qapitol.Controller;

import com.qapitol.Model.Student;
import com.qapitol.Model.Teacher;
import com.qapitol.Service.ServiceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager
{
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        ServiceImplementation service = new ServiceImplementation();
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Add Student\n 2. Remove Student\n 3.Get Student\n 4.Add Teacher\n 5.Remove Teacher\n 6.Get Teacher\n 7.dispaly student Details\n 8.display teacher Details\n");
            int option = sc.nextInt();
            switch (option)
            {
                case 1:
                {
                    while (true) {
                        System.out.print("Enter student's Id: ");
                        int id = sc.nextInt();

                        System.out.print("Enter student's Marks: ");
                        int marks = sc.nextInt();

                        System.out.print("Enter student's age: ");
                        int age = sc.nextInt();

                        students.add(new Student(id, marks, age));
                        System.out.print("Do you want to add another student? (yes/no): ");
                        String response = sc.next();

                        if (!response.equalsIgnoreCase("yes"))
                        {
                             break;
                        }
                    }
                }
                break;
                case 2:
                {
                    System.out.println("Enter the student ID you want Remove: ");
                    int studentID = sc.nextInt();
                    service.removeStudentById(students, studentID);
                }
                break;
                case 3:
                {
                    System.out.println("Enter the student ID you want fetch: ");
                    int studentID = sc.nextInt();
                    service.getStudentById(students, studentID);


                }
                break;
                case 4:
                {
                    while (true) {
                        System.out.print("Enter Teacher Name: ");
                        String name = sc.next();

                        System.out.print("Enter subject: ");
                        String subject = sc.next();

                        System.out.print("Enter salary: ");
                        int salary = sc.nextInt();

                        teachers.add(new Teacher(name,subject,salary));
                        System.out.print("Do you want to add another teacher? (yes/no): ");
                        String response = sc.next();

                        if (!response.equalsIgnoreCase("yes"))
                        {
                            break;
                        }
                    }
                }
                break;
                case 5:
                {
                    System.out.println("Enter the teacher name you want Remove: ");
                    String teacherName = sc.next();
                    service.removeTeacherByName(teachers,teacherName);
                }
                break;
                case 6:
                {

                    System.out.println("Enter the teacher Name you want fetch: ");
                    String teacherName = sc.next();
                   service.getTeacherByName(teachers,teacherName);
                }
                break;
                case 7:
                {
                    service.displayStudents(students);
                }
                break;
                case 8:
                {
                    service.displayTeachers(teachers);
                }
                break;
                default:
                {
                    System.out.println("Invalid option");
                }
                break;
            }
        }

    }

}

package com.qapitol.Service;

import com.qapitol.Model.Student;
import com.qapitol.Model.Teacher;

import java.util.List;

public class ServiceImplementation implements Service {
    @Override
    public void displayTeachers(List<Teacher> teachers) {
        System.out.println("\nTeachers:");
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getName() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());

        }
    }

    @Override
    public void displayStudents(List<Student> students) {
        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Marks: " + student.getMarks() + ", Age: " + student.getAge());

        }
    }

    @Override
    public void modifyTeacher(List<Teacher> teachers, int index, String newName, String newSubject, double newSalary) {
        if (index >= 0 && index < teachers.size()) {
            Teacher modifiedTeacher = new Teacher(newName, newSubject, newSalary) {

            };
            teachers.set(index, modifiedTeacher);
            System.out.println("Teacher details updated successfully.");
        } else {
            System.out.println("Invalid index for teacher modification.");
        }
    }

    @Override
    public void modifyStudent(List<Student> students, int index, int newId, int newMarks, int newAge) {
        if (index >= 0 && index < students.size()) {
            Student modifiedStudent = new Student(newId, newMarks, newAge) {
            };
            students.set(index, modifiedStudent);
            System.out.println("Student details updated successfully.");
        } else {
            System.out.println("Invalid index for student modification.");
        }
    }

    public void removeStudentById(List<Student> students, int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Successfully Removed student "+id);
        System.out.println("to check please select 7");
    }

    public void getStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("ID: " + student.getId() + ", Marks: " + student.getMarks() + ", Age: " + student.getAge());
            }
        }
    }

    public void removeTeacherByName(List<Teacher> teachers, String name) {
        teachers.removeIf(teacher -> teacher.getName().equals(name));
        System.out.println("Successfully Removed teacher Details "+name);
        System.out.println("to check please select 8");
    }

    public void getTeacherByName(List<Teacher> teachers, String name) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                System.out.println("Name: " + teacher.getName() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());

            }
        }
    }
}

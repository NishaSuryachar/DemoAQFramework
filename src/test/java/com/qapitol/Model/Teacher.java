package com.qapitol.Model;

public class Teacher
{
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }
    public void display() {
        System.out.println("Name: " + name + ", subject: " + subject + ", salary: " + salary);
    }

    public void list() {
        System.out.println("Name: " + name);
    }

}

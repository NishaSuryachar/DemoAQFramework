package com.qapitol.Model;

public class Student
{
    private int id;
    private int marks;
    private int age;

    public Student(int id, int marks, int age) {
        this.id = id;
        this.marks = marks;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Id: " + id + ", Age: " + age + ", marks: " + marks);
    }

}

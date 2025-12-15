package org.example;

public class Student extends Person{
    String courseName;

    void printStudentInfo (){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + courseName);
    }
}

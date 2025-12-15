package org.example;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name="Gvantsa";
        student.age=26;
        student.courseName="Automation";

        student.printInfo();
        student.printStudentInfo();

        Dog dog = new Dog();
        dog.makeSound();


        int studentScores [] = {100, 82, 93, 73, 87, 65};
        for (int i=0; i<studentScores.length; i++){
            if (studentScores[i]>75) {
                System.out.println(studentScores[i]);
            }
        }

        Rose rose = new Rose();
        rose.color="Red";
        rose.petals=32;
        rose.setHeight(50);

        rose.bloom();
        rose.smell();

        Document document = new Document();
        document.print();
        document.scan();
        document.save();


    }
}
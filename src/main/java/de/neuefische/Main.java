package de.neuefische;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Max", "1M");
        Student student2 = new Student("Maxi", "1Mi");
        Student student3 = new Student("Maximilian", "1Ma");

        Student[] students = {student1,student2,student3};

        StudentDB studentDB = new StudentDB(students);

        for (int i = 0;i < 10;i++){
            System.out.println(studentDB.randomStudent());
        }


    }
}
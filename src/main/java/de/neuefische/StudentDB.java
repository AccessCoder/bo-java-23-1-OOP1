package de.neuefische;

import java.util.Arrays;
import java.util.Random;


public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student randomStudent(){
        Random rng = new Random();
        int index = rng.nextInt(students.length);
        return students[index];
    }


    public Student[] getAllStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

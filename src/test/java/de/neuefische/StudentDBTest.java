package de.neuefische;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void getAllStudents_shouldReturn_threeStudents(){
        //GIVEN
        Student student1 = new Student("Max", "1M");
        Student student2 = new Student("Maxi", "1Mi");
        Student student3 = new Student("Maximilian", "1Ma");

        Student[] students = {student1,student2,student3};

        StudentDB studentDB = new StudentDB(students);
        //WHEN
        Student[] actual = studentDB.getAllStudents();
        //THEN
        assertArrayEquals(students, actual);

    }

    @Test
    void getAllStudents_shouldReturn_threeStudentsShuffled(){
        //GIVEN
        Student student1 = new Student("Max", "1M");
        Student student2 = new Student("Maxi", "1Mi");
        Student student3 = new Student("Maximilian", "1Ma");

        Student[] students = {student1,student2,student3};

        StudentDB studentDB = new StudentDB(students);

        Student[] expected = {student2, student3, student1};
        Arrays.sort(expected);

        //WHEN
        Student[] actual = studentDB.getAllStudents();
        Arrays.sort(actual);
        //THEN
        assertArrayEquals(expected, actual);

    }


}
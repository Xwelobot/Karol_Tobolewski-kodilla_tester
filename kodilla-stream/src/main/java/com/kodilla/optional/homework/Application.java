package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Teacher teacher1 = new Teacher("Jan Nowak");
        Teacher teacher2 = new Teacher("Adam Pawlak");

        students.add(new Student("Michal Michalak", teacher1));
        students.add(new Student("Jacek Placek", null));
        students.add(new Student("Karol Karolak", teacher2));

        for(Student student : students){
            String teacherName = student.getTeacher()
                    .map(Teacher::getName)
                    .orElse("<undefined>");

            System.out.println("Uczeń: " + student.getName() + ", Nauczyciel: " + teacherName);
        }

    }
}


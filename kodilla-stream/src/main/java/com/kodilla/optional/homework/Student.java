package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    private String name;
    private Optional<Teacher> teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = Optional.ofNullable(teacher);
    }

    public String getName() {
        return name;
    }

    public Optional<Teacher> getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}

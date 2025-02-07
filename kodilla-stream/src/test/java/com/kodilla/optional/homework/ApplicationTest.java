package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    public void testStudentAndTeachers() {

        Teacher teacher = new Teacher("Tomasz Nowak");

        Student student = new Student("Michal Mich", teacher);

        assertTrue(student.getTeacher().isPresent(), "Teacher should be present.");
        assertEquals("Tomasz Nowak", student.getTeacher().get().getName(), "Teacher's name should match.");
    }

    @Test
    public void studentWitchoutTeacher() {
        Student student = new Student("Michal Mich", null);

        assertFalse(student.getTeacher().isPresent());
    }

    @Test
    public void testStudentWithTeacherIsDisplayedCorrectly() {
        Teacher teacher = new Teacher("Tomasz Nowak");
        Student student = new Student("Jan Kowalski", teacher);

        String teacherName = student.getTeacher().map(Teacher::getName).orElse("<undefined>");
        assertEquals("Tomasz Nowak", teacherName);
    }

    @Test
    public void testStudentWithoutTeacherIsDisplayedCorrectly() {
        Student student = new Student("Marek Nowak", null);

        String teacherName = student.getTeacher().map(Teacher::getName).orElse("<undefined>");
        assertEquals("<undefined>", teacherName);
    }
}

package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String Responsibilities() {
        StringBuilder responsibilities = new StringBuilder("Responsibilities: ");
        for (ResponsibilityEnum responsibility : job.responsibilities()) {
            responsibilities.append(responsibility).append(", ");
        }
        return responsibilities.toString();
    }
}


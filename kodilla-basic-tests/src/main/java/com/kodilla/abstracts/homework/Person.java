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
        var array = job.responsibilities();
        for (int i = 0; i < array.length; i++) {
            responsibilities.append(array[i]);
            if(i < array.length -1)
                responsibilities.append(", ");
        }
        return responsibilities.toString();
    }
}


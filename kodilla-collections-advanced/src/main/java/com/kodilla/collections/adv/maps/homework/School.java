package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Double> classes = new ArrayList<>();

    public School(String schoolName, List<Double> classes){
        this.schoolName = schoolName;
        this.classes = classes;
    }

    public double getAll(){
        double sum = 0;
        for(double allClasses : classes)
            sum += allClasses;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", classes=" + classes +
                '}';
    }
}

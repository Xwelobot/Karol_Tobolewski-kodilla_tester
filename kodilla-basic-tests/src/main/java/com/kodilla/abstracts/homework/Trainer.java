package com.kodilla.abstracts.homework;

public class Trainer extends Job{

    @Override
    public double salary() {
        return 5.445;
    }

    @Override
    public ResponsibilityEnum[] responsibilities() {
        return new ResponsibilityEnum[] {ResponsibilityEnum.Training, ResponsibilityEnum.Development};
    }
}

package com.kodilla.abstracts.homework;

public class Developer extends Job{

    @Override
    public double salary() {
        return 7.500;
    }

    @Override
    public ResponsibilityEnum[] responsibilities() {
        return new ResponsibilityEnum[] {ResponsibilityEnum.Development};
    }
}

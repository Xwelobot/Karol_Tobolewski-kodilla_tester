package com.kodilla.abstracts.homework;

public class Manager extends Job{

    @Override
    public double salary() {
        return 10.221;
    }

    @Override
    public ResponsibilityEnum[] responsibilities() {
        return new ResponsibilityEnum[] {ResponsibilityEnum.Management};
    }
}

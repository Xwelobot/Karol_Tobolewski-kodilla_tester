package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String name;
    private double size;
    private String stampled;

    public Stamp(String name, double size, String stampled){
        this.name = name;
        this.size = size;
        this.stampled = stampled;
    }

    public String getname(){
        return name;
    }

    public double getSize(){
        return size;
    }

    public String getStampled(){
        return stampled;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(size, stamp.size) == 0 && Objects.equals(name, stamp.name) && Objects.equals(stampled, stamp.stampled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, stampled);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", stampled='" + stampled + '\'' +
                '}';
    }
}

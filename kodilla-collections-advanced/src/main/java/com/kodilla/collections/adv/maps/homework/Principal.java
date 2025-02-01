package com.kodilla.collections.adv.maps.homework;


import java.util.Objects;

public class Principal {
    String principalName;

    public Principal(String principalName) {
        this.principalName = principalName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(principalName, principal.principalName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(principalName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalName='" + principalName + '\'' +
                '}';
    }

    public String getPrincipalName() {
        return principalName;
    }
}
package com.kodilla;

public class User {
    String name;
    double age;
    double height;

    public User(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void Application() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
public class Application {
    public static void main(String[] args) {
        User user = new User("Adam", 40.5, 178);
        user.Application();
    }
}
package com.kodilla;

public class User {
    private String userName;
    private int userAge;

    public User (String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }
    public String getUserName() {
        return userName;
    }
    public int getUserAge() {
        return userAge;
    }
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Jan", 22);
        users[1] = new User("Anita", 25);
        users[2] = new User("Zbigniew", 40);
        users[3] = new User("Julia", 29);
        users[4] = new User("Janita", 34);

        int sumUserAge = 0;
        for (User user : users) {
            sumUserAge += user.getUserAge();
        }
        double averageUserAge = sumUserAge / (double) users.length;
        System.out.println("Sredni wiek: " + averageUserAge);

        System.out.println("Wiek tych uzytkownikow jest ponizej sredniej wieku: ");
        for (User user : users) {
            if (averageUserAge > user.getUserAge()) {
                System.out.println(user.getUserName());
            }
        }
    }
}



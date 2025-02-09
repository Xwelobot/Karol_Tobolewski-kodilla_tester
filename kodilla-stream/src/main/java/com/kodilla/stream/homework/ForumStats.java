package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static double oldAvg(List<User> users) {
         return users
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .orElse(0.0);
    }
    public static double youngAvg(List<User> users){
        return users
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }
    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();
        double postAvg = oldAvg(users);
        System.out.println(postAvg);
        double postAvgYoung = youngAvg(users);
        System.out.println(postAvgYoung);
    }
}


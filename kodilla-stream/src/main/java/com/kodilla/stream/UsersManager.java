package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<String> ageAbove44 = filterAgeOfUsers(44);
        System.out.println(ageAbove44);
        List<String> userWithNoPosts = filterNumberOfPosts();
        System.out.println(userWithNoPosts);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    public static List<String> filterAgeOfUsers(int age) {
        List<String> userages = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return userages;
    }

    public static List<String> filterNumberOfPosts() {
        List<String> userposts = UsersRepository.getUsersList()
                .stream()
                .filter(post -> post.getNumberOfPost() == 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return userposts;
    }
}

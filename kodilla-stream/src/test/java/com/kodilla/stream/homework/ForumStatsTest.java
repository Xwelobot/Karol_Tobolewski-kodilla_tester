package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    List<User> users = UsersRepository.getUsersList();

    @Test
    public void testIfAvgOldIsOk(){
        double oldies = ForumStats.oldAvg(users);
        assertEquals(2.25, oldies);
    }

    @Test
    public void testIfAvgYoungIsOk(){

        double youngies = ForumStats.youngAvg(users);
        assertEquals(2382, youngies);
    }


}
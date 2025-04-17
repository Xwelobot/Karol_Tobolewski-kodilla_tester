package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TaskListRepositoryTest {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("Test List", "This is a test list");
        taskListRepository.save(taskList);

        // When
        List<TaskList> foundTaskLists = taskListRepository.findByListName("Test List");

        // Then
        assertEquals(1, foundTaskLists.size());
        assertEquals("Test List", foundTaskLists.get(0).getListName());
        assertEquals("This is a test list", foundTaskLists.get(0).getDescription());

        // CleanUp
        taskListRepository.deleteAll();
    }
}
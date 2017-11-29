package edu.inlab.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskListTest {

    @Test
    public void CreateEmptyTaskList() {
        // Act
        TaskList tl = new TaskList();

        // Assert
        assertEquals(0, tl.size());
    }

    @Test
    public void AddNewTask() {
        // Arrange
        TaskList tl = new TaskList();

        // Act
        Task task = new Task("comprar butiffara");
        tl.addTask(task);

        // Assert
        assertEquals(1, tl.size());
    }
}

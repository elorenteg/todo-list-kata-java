package edu.inlab.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {
    @Test
    public void testNewTask() {
        // Act
        Task task = new Task("comprar tomates");

        // Assert
        assertEquals("comprar tomates", task.getDescription());
    }

    @Test
    public void changeDescription() throws Exception {
        // Arange
        Task task = new Task("comprar tomates");

        // Act
        task.setDescription("comprar 2 tomates");

        // Assert
        assertEquals("comprar 2 tomates", task.getDescription());
    }

    @Test
    public void markTaskAsDone() {
        // Arange
        Task task = new Task("comprar tomates");

        // Act
        task.setAsDone();

        // Assert
        assertTrue(task.isDone());
    }

    @Test
    public void TaskIsNotDoneByDefault() throws Exception {
        // Act
        Task task = new Task("comprar tomates");

        // Assert
        assertFalse(task.isDone());
    }
}
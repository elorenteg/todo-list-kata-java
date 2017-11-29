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
}
package edu.inlab.katas;

import org.junit.Before;
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

    @Test
    public void DeleteTaskFromTasklist() throws Exception {
        // arrange
        TaskList tl = new TaskList();
        Task task = new Task("comprar butiffara");
        tl.addTask(task);

        //act
        int before_size = tl.size();
        tl.deleteTask(task);

        //assert
        assertNotEquals("Size of list is differennt", before_size, tl.size());
        assertEquals("List not contains the task", false, tl.contain(task));
    }

}

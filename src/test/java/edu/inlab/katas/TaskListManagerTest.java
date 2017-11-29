package edu.inlab.katas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ester.lorente on 29/11/2017.
 */
public class TaskListManagerTest {

    @Test
    public void AddNewTaskList() throws Exception {
        //arrange
        TaskList tl = new TaskList();
        TaskListManager manager = new TaskListManager();

        //act
        manager.addTaskList(tl);

        //assert
        assertTrue("contains the added tasklist", manager.contains(tl));

    }
}

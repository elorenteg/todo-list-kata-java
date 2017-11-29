package edu.inlab.katas;

import java.util.ArrayList;

/**
 * Created by ester.lorente on 29/11/2017.
 */
public class TaskListManager {
    private ArrayList<TaskList> lists;

    public TaskListManager() {
        this.lists = new ArrayList<TaskList>();
    }

    public void addTaskList(TaskList tl) {
        lists.add(tl);
    }

    public boolean contains(TaskList tl) {
        return  lists.contains(tl);
    }
}

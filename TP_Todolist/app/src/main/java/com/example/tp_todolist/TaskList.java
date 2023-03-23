package com.example.tp_todolist;

import java.util.ArrayList;

/**
 * List les tâches
 */
public class TaskList
{
    private ArrayList<Task> task = new ArrayList<Task>();

    public ArrayList<Task> getTask() {
        return task;
    }

    public void setTask(ArrayList<Task> task) {
        this.task = task;
    }
}

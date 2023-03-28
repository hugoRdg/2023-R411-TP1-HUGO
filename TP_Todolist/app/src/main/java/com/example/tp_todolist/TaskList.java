package com.example.tp_todolist;

import java.util.ArrayList;

/**
 * List les tâches
 */
public class TaskList
{
    /**
     *Notre nouvelle liste de tâches vide
     */
    private ArrayList<Task> task = new ArrayList<Task>();

    /**
     * On récupère les tâches dans notre list
     * @return les tâches
     */
    public ArrayList<Task> getTask() {
        return task;
    }

    /**
     * On set les tâches pour notre list
     * @param task
     */
    public void setTask(ArrayList<Task> task) {
        this.task = task;
    }
}

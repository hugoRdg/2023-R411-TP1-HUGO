package com.example.tpapplicationmobile;

import java.util.ArrayList;

/**
 * List les tâches
 */
public class TaskList
{
    /**
     * Nouvelle liste pour les tâches
     */
    private ArrayList<Task>task = new ArrayList<Task>();

    /**
     * On récupère les tâches
     * @return
     */
    public ArrayList<Task> getTask() {
        return task;
    }

    /**
     * Set des tâches
     * @param task
     */
    public void setTask(ArrayList<Task> task) {
        this.task = task;
    }

}

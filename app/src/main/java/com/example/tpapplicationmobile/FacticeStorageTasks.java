package com.example.tpapplicationmobile;

import android.icu.text.CaseMap;

import java.util.ArrayList;

public class FacticeStorageTasks implements IStorageTasks
{

    @Override
    public TaskList ReadTasks() {
        TaskList taskList = new TaskList();
        ArrayList<Task> tasks = new ArrayList<Task>();
        Task PremièreTask = new Task("Math","Exercice 1 à faire",2, false);
        Task SecondeTask = new Task("Dev","TP02 à faire",4, false);
        tasks.add(PremièreTask);
        tasks.add(SecondeTask);
        taskList.setTask(tasks);
        return taskList;
    }

    @Override
    public void AddTask(Task task)
    {

    }

    @Override
    public void UpdateTask(Task task)
    {

    }
}

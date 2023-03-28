package com.example.tp_todolist;

import java.util.ArrayList;

public class FacticeStorageTasks implements IStorageTasks
{

    /**
     * Permet d'ajouter nos tâches factices
     * @return FacticeTask
     */
    @Override
    public TaskList ReadTasks()
    {
        //Nouvelle list
        TaskList taskList = new TaskList();
        ArrayList<Task> tasks = new ArrayList<Task>();

        //Première tâche
        Task PremièreTask = new Task("Math","Exercice 1 à faire",2, false);

        //Seconde tâche
        Task SecondeTask = new Task("Dev","TP02 à faire",4, false);

        //Ajout des tâches
        tasks.add(PremièreTask);
        tasks.add(SecondeTask);
        taskList.setTask(tasks);

        //Retourne notre liste
        return taskList;
    }
}

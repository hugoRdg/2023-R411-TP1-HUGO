package com.example.tp_todolist;

/**
 * Interface permettant d'afficher les diférrentes tâches
 *
 */
public interface IStorageTasks
{
    /**
     * Lis nos tâches
     * @return TaskList
     */
    public TaskList ReadTasks();
}

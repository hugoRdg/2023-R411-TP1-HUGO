package com.example.tpapplicationmobile;

/**
 * Interface permettant d'afficher les diférrentes tâches
 *
 */
public interface IStorageTasks
{
    /**
     *
     * @return la liste
     */
    public TaskList ReadTasks();

    /**
     * Ajouter la tâche
     * @param task
     */
    public void AddTask(Task task);

    /**
     * Met à jour là tâche
     * @param task
     */
    public void UpdateTask(Task task);
}

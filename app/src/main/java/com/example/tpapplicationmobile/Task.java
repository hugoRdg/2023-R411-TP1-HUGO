package com.example.tpapplicationmobile;

import java.io.Serializable;

public class Task implements Serializable
{
    private String title;
    private String description;
    private int priority;
    private boolean completed;

    /**
     * Constructuer de la classe Task
     * @param title
     * @param description
     * @param priority
     * @param completed
     */
    public Task(String title, String description, int priority, boolean completed)
    {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }

    /**
     * On retrouve le get et set du title
     *
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * On retrouve le get et set de la description
     *
     * @return description
     */
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * On retrouve le get et set pour les priority
     *
     * @return priority
     */
    public int getPriority()
    {
        return priority;
    }
    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    /**
     * On retrouve le get et set pour le boolean completed
     *
     * @return completed
     */
    public boolean isCompleted()
    {
        return completed;
    }
    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    /**
     * Affichage de nos tâches
     * @return nos tâches
     */
    public String toString()
    {
        return this.isCompleted() + this.getTitle() + this.getDescription() + this.getPriority();
    }
}

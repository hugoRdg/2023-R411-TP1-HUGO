package com.example.tp_todolist;

import java.io.Serializable;

public class Task implements Serializable
{
    private String title;
    private String description;
    private int priority;
    private boolean completed;

    /**
     * Constructeur de Task
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
     * @return
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
     * @return
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
     * @return
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
     * @return
     *
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
     * Notre affichage
     * @return
     */
    public String toString()
    {
        return this.isCompleted() + this.getTitle() + this.getDescription() + this.getPriority();
    }
}

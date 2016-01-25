package com.spitfireathlete.nidhi.todo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by nidhikulkarni on 1/23/16.
 */


public class Task {

    private String name;
    private String description;
    private Calendar deadline;
    private Priority priority;
    private boolean isComplete;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.isComplete = false;
        this.priority = Priority.LOW; // default priority is LOW
        // deadline is today by default
        this.deadline = Calendar.getInstance();
    }

    public Task(String name, String description, long dueDateInMillis, int priority) {
        this.name = name;
        this.description = description;
        this.isComplete = false;
        this.deadline = new GregorianCalendar();
        this.deadline.setTimeInMillis(dueDateInMillis);
        this.priority = Priority.fromValue(priority);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return name + "," + description + "," + this.deadline.getTimeInMillis() + "," + this.priority.ordinal();
    }

    public Calendar getDeadline() {
        return deadline;
    }

    public void setDeadline(Calendar deadline) {
        this.deadline = deadline;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
}

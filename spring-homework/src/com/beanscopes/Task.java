package com.beanscopes;

import java.util.Random;

public class Task {
    private String taskName;
    private Integer taskId;
    private Integer executionTime;
    private static int numberOfTasks = 0;
    private static Integer uniqueID = -1;

    public Task() {
        System.out.println("Current number of instances: " + this.numberOfTasks);
    }

    private void performInitialization() {
        this.numberOfTasks += 1;
        this.taskId = generateId();
        this.taskName = "Task " + this.taskId;
        Random random = new Random();
        this.executionTime = (int) (Math.random()*(19) + 1);
        System.out.println("Number of tasks " + this.numberOfTasks + ", task id " + this.taskId + ", task name " + this.taskName
                + ", execution time " + this.executionTime + ".");
    }

    private void performDestruction() {
        this.numberOfTasks -= 1;
    }

    public void run(){
        try {
            Thread.sleep(this.executionTime);
            System.out.println("The main execution sleeps for " + this.executionTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int getNumberOfTasks(){
        return Task.numberOfTasks;
    }

    public Integer generateId(){
        this.uniqueID += 1;
        return this.uniqueID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }
}

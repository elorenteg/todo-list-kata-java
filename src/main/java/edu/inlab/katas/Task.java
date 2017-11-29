package edu.inlab.katas;

public class Task {
    public String description;
    private boolean isDone;

    public Task(String s) {
        this.description = s;
        isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String s) {
        this.description = s;
    }

    public void setAsDone() {
        this.isDone = true;
    }

    public boolean isDone() {
        return isDone;
    }
}

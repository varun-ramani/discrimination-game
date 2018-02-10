package com.varun.disgame.levels;

public abstract class Level {
    private String choices = "";
    private boolean done = false;
    public abstract void start();
    protected String getChoices() {
        return choices;
    }
    public void appendChoice(char c) {
        choices += c;
    }
    public void undoLastChoice() {
        choices = choices.substring(0, choices.length() - 1);
    }
    public void setDone() {
        done = true;
    } 
    public boolean isDone() {
        return done;
    }

    public abstract void loop();

}
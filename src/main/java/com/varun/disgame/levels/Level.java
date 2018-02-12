package com.varun.disgame.levels;

public abstract class Level {
    private StringBuilder choices = new StringBuilder("");
    private boolean done = false;
    public abstract void start();
    protected String getChoices() {
        return choices.toString();
    }
    public void appendChoice(char c) {
        choices.append(c);
    }
    public void undoLastChoice() {
        choices = new StringBuilder(choices.substring(0, choices.length() - 1));
    }
    public void setDone() {
        done = true;
    } 
    public boolean isDone() {
        return done;
    }
    public void setChoices(String c) {
        choices = new StringBuilder(c);
    }
    public abstract void loop();

}

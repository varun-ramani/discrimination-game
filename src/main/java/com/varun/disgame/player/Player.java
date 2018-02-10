package com.varun.disgame;

public class Player {
    private static long score = 0;
    private static String choices = ""; // lol - taking that easy way out
    private static String name = "";


    public static long getScore() {
        return score;
    }

    public static String getChoices() {
        return choices;
    }

    public static String getName() {
        return name;   
    } 

    public static void changeScore(int amount) {
        score += amount;
    } 

    public static void appendChoice(char choice) {
        choices += choice;
    }

    public static void setName(String _name) {
        name = _name;
    }

}
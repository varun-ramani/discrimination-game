package com.varun.disgame.player;
import com.varun.disgame.levels.*;
import com.varun.disgame.player.character.Character;

public class Player {
    private static long score = 0;
    private static String name = "";
    private static Level level;
    private static Character character;

    public static long getScore() {
        return score;
    }

    public static String getName() {
        return name;   
    } 

    public static void changeScore(int amount) {
        score += amount;
    } 

    public static void setName(String _name) {
        name = _name;
    }

    public static void setLevel(Level _level) {
        level = _level;
    }

    public static void play() {
        level.start();
    }

    public static void setCharacter(Character c) {
        character = c;
    }

    public static Character getCharacter() {
        return character;
    }

}

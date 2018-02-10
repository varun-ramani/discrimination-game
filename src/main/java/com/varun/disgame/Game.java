package com.varun.disgame;

import com.varun.disgame.levels.Sunday;
import com.varun.disgame.player.*;

public class Game {
    public void begin() {
        printGameTitle();
        Player.setName(Utils.readString("Entras Tu Nombre > "));
        Player.setLevel(new Sunday());
        Player.play();
    }

    public void printGameTitle() {
        Utils.coolPrint("+------------------------------+\n", 10);
        Utils.coolPrint("|  El Juego De Discriminacion  |\n", 10);
        Utils.coolPrint("|     De Varun y Danzel        |\n", 10);
        Utils.coolPrint("+------------------------------+\n", 10);
    }
}
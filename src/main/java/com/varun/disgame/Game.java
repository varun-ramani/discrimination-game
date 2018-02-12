package com.varun.disgame;

import com.varun.disgame.levels.Sunday;
import com.varun.disgame.levels.Saturday;
import com.varun.disgame.player.*;

public class Game {
    public void begin() {
        printGameTitle();
        Player.setName(Utils.readString("Entra Tu Nombre > "));
        Player.setLevel(new Sunday());
        Player.play();
    }

    public void printGameTitle() {
        Utils.coolPrint("+------------------------------+\n", 50);
        Utils.coolPrint("|  El Juego De Discriminacion  |\n", 50);
        Utils.coolPrint("|     De Varun y Danzel        |\n", 50);
        Utils.coolPrint("+------------------------------+\n\n", 50);
    }
}
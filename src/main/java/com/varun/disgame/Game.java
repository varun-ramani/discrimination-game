package com.varun.disgame;

import com.varun.disgame.levels.*;

public class Game {
    private Level[] levels = {
        new LVL1()
    };

    public void begin() {
        printGameTitle();
    }

    public void printGameTitle() {
        Utils.coolPrint("+------------------------------+\n", 10);
        Utils.coolPrint("|  El Juego De Discriminacion  |\n", 10);
        Utils.coolPrint("|     De Varun y Danzel        |\n", 10);
        Utils.coolPrint("+------------------------------+\n", 10);
    }
}

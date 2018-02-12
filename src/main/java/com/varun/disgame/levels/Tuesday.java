package com.varun.disgame.levels;

import com.varun.disgame.Utils;
import com.varun.disgame.player.Player;

/**
 * Created by yetski on 2/11/2018.
 */
public class Tuesday extends Level{

    public void start(){
        Utils.coolPrint(Utils.genLevelTitle("Lunes", "26 Febrero 2018"), 20);
        while(!(isDone())) {
            loop();
        }
        Player.setLevel(new Wednesday());
        Player.play();
    }

    public void loop(){
        switch(getChoices()) {
            case "":
                Utils.coolPrint(String.format("8:00 AM >> <%s desperto>\n8:15 AM >> <%s cepillo sus dientes>\n", Player.getName(),Player.getName()), 10);
                appendChoice(
                        Utils.readChar(
                                Utils.storyPrompt(
                                        String.format("8:30 AM >> <%s camino hacia tu trabajo>\n8:40 AM >> <%s vio a una persona china que hablaba con un acento extraño. \nLa persona estaba intentando vender algo y nada persona estaba comprando>\n¿Que hizo?", Player.getName(),Player.getName()), new String[] {
                                                "Comprar educadamente y sonriale",
                                                "Búrlate de su acento y camine hacia tu trabajo como un " + Player.getCharacter().getJobTitle(),
                                                "No dijo nada y sigue camine\n"
                                        }
                                )
                        )
                );
                break;
            case "1":
                Utils.coolPrint(String.format("8:31 AM >> <%s dijo Hola! Compraré lo que estás vendiendo >\nMexicano: \"Oh muchas gracias!\n\"", Player.getName()), 10);
                Player.changeScore(1);
                setChoices("#");
                break;
            case "2":
                Utils.coolPrint(String.format("8:31 AM >> <%s dijo: \"jajaja, tu acento es gracioso porque eres una persona china\">\n", Player.getName()), 10);
                Player.changeScore(-1);
                setChoices("#");
                break;
            case "3":
                Utils.coolPrint(String.format("8:31 AM >> <%s dijo nada y sigue caminar>\n", Player.getName()), 10);
                setChoices("#");
                break;
            case "#":
                Utils.coolPrint(String.format("8:45 AM >> <Llegó al trabajo y comenzó a trabajar>\n12:00 PM >> <%s comió el almuerzo>\n5:00 PM >> <%s fue a casa y durmió a las 8 y media de la noche>\n",Player.getName(),Player.getName(),Player.getName()),10);
                setDone();
                break;
            default:
                Utils.coolPrint(String.format("%c no es un option valido!\n", getChoices().charAt(getChoices().length() - 1)), 10);
                undoLastChoice();
                break;
        }
    }
}

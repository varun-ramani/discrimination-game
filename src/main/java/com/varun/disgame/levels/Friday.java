package com.varun.disgame.levels;

import com.varun.disgame.Utils;
import com.varun.disgame.player.Player;

/**
 * Created by yetski on 2/12/2018.
 */
public class Friday extends Level {
    public void start(){
        Utils.coolPrint(Utils.genLevelTitle("Lunes", "26 Febrero 2018"), 20);
        while(!(isDone())) {
            loop();
        }
        Player.setLevel(new Saturday());
        Player.play();
    }

    public void loop(){
        switch(getChoices()) {
            case "":
                appendChoice(
                        Utils.readChar(
                                Utils.storyPrompt(
                                        String.format("8:00 AM >> <la alarma de %s sona>\n", Player.getName()), new String[] {
                                                "Snooze",
                                                "Dismiss"
                                        }
                                )
                        )
                );
                break;
            case "1":
            case "2":
                Utils.coolPrint(String.format("8:01 AM >> <El despertador está realmente roto>\n", Player.getName()), 10);
                appendChoice('#');
                break;
            case "1#":
            case "2#":
                Utils.coolPrint(String.format("8:45 AM >> <Llegó al trabajo y comenzó a trabajar>\n12:00 PM >> <%s obtuvio el almuerzo>\n",Player.getName(),Player.getName()),10);
                appendChoice(
                        Utils.readChar(
                                Utils.storyPrompt(
                                        String.format("12:10 PM >> <La mujer del almuerzo es blanca, ¿qué le dijo él?>\n", Player.getName()), new String[] {
                                                "Gracias por la comida mujer del almuerzo!\n",
                                                "Los blancos no pueden hacer buena comida"
                                        }
                                )
                        )
                );
                break;
            case "1#1":
            case "2#1":
                Utils.coolPrint(String.format("12:13 AM >> <La mujer sonrió>\n"),10);
                Player.changeScore(1);
                Utils.coolPrint(String.format("5:00 PM >> <%s fue a casa y durmió a las 8 y media de la noche>\n",Player.getName()),10);
                setDone();
                break;
            case "1#2":
            case "2#2":
                Utils.coolPrint(String.format("12:13 AM >> <La mujer le dio un ojo morado>\n"),10);
                Player.changeScore(-1);
                Utils.coolPrint(String.format("5:00 PM >> <%s fue a casa y durmió a las 8 y media de la noche con un ojo morado>\n",Player.getName()),10);
                setDone();
                break;
            default:
                Utils.coolPrint(String.format("%c no es un option valido!\n", getChoices().charAt(getChoices().length() - 1)), 10);
                undoLastChoice();
                break;
        }
    }
}

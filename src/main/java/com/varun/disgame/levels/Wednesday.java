package com.varun.disgame.levels;

import com.varun.disgame.Utils;
import com.varun.disgame.player.Player;
import com.varun.disgame.player.character.Baker;
import com.varun.disgame.player.character.Businessman;
import com.varun.disgame.player.character.Character;
import com.varun.disgame.player.character.Programmer;

public class Wednesday extends Level {
    public void start() {
        Utils.coolPrint(Utils.genLevelTitle("Miercoles", "28 Febrero 2018"), 20);
        while(!(isDone())) {
            loop();
        }
        Player.setLevel(new Thursday());
        Player.play();

    }

    public void loop() {
        switch(getChoices()) {
            case "":
                appendChoice('#');
                Utils.readChar(
                    Utils.storyPrompt(
                        String.format("6:00 AM  >> < la alarma de %s sona>\n6:05 AM  >> %s se lavantanse. Ahoy, tiene un reunion no con su jefe - con EL jefe! Es muy importante. \nPero - que camisa?", Player.getName(), Player.getName()), new String[] {
                            "La camisa azul",
                            "La camisa verde",
                            "La camisa negro"
                        }
                    )
                );
                break;
            case "#":
                appendChoice(
                    Utils.readChar(
                        Utils.storyPrompt(
                            String.format("%s queria una augmento de la salaria.\nPero, cuando visita el jefe, %s nota que el jefe es negro!\n", Player.getName(), Player.getName()),
                            new String[] {
                                "Tratar el jefe con respecto - su color no es importante.",
                                "Jefe es negro - no necesita respecto!"
                            }
                        )
                    )
                );
                break;
            case "#1":
                Player.changeScore(1);
                Utils.coolPrint(String.format("Jefe de %s: Vale! %s, antes, tu salaria era $1 en un ano! Ahora... es $1.50 en un ano!\n", Player.getCharacter().getWorkplace(), Player.getName()), 20);
                Utils.coolPrint(String.format("%s: Gracias! Finalmente, puedo comprar una computadora para iFunny!\n", Player.getName()), 20);
                Utils.coolPrint("Jefe: iFunny? Reddit tiene memes superior!\n", 20);
                Utils.coolPrint(String.format("%s: Reddit tenia memes superior, pero ahora, iFunny tiene memes fantastico!\n", Player.getName()), 20);
                setDone();
                break;
            case "#2":
                Player.changeScore(-1);
                Utils.coolPrint(String.format("Jefe: Despues de ahora, no eras una %s en %s. Tu salaria es $0.01 en un ano ahora. Racista estupida!\n", Player.getCharacter().getJobTitle(), Player.getCharacter().getWorkplace()), 20);
                setDone();
                break;
            default:
                Utils.coolPrint(String.format("%c no es un option verdad!\n", getChoices().charAt(getChoices().length() - 1)), 20);
                undoLastChoice();
                break;
        }
    }

}

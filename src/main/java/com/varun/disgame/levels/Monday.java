package com.varun.disgame.levels;

import com.varun.disgame.Utils;
import com.varun.disgame.player.Player;
import com.varun.disgame.player.character.*;
import com.varun.disgame.player.character.Character;

public class Monday extends Level {
    public void start() {
        Utils.coolPrint(Utils.genLevelTitle("Lunes", "5 Febrero 2018"), 20);
        while(!(isDone())) {
            loop();
        }
    }

    public void loop() {
        switch(getChoices()) {
            case "":
                appendChoice(
                    Utils.readChar(
                        Utils.storyPrompt(
                            String.format("6:00 AM  >> < la alarma de %s sona>\n%s necessita ir a su paiz de trabajar; es un ________.\n", Player.getName(), Player.getName()), new String[] {
                                "Programador",
                                "Empresario",
                                "Panedero"
                            }
                        )
                    )
                );
                break;
            case "1":
                Player.setCharacter(new Programmer());
                Utils.coolPrint(
                    String.format("%s %s en %s.\n", Player.getName(), Player.getCharacter().getJobVerb(Character.Conjugations.EL_ELLA_USTED), Player.getCharacter().getWorkplace()), 10
                );
                appendChoice('#');
                break;
            case "2":
                Player.setCharacter(new Businessman());
                Utils.coolPrint(
                    String.format("%s %s en %s.\n", Player.getName(), Player.getCharacter().getJobVerb(Character.Conjugations.EL_ELLA_USTED), Player.getCharacter().getWorkplace()), 10
                );
                appendChoice('#');
                break;
            case "3":
                Player.setCharacter(new Baker());
                Utils.coolPrint(
                    String.format("%s %s en %s.\n", Player.getName(), Player.getCharacter().getJobVerb(Character.Conjugations.EL_ELLA_USTED), Player.getCharacter().getWorkplace()), 10
                );
                appendChoice('#');
                break;
            case "1#":
            case "2#":
            case "3#":
                appendChoice(
                    Utils.readChar(
                        Utils.storyPrompt(
                            String.format("Cuando %s camina a %s, ve a un musulman. El musulman tiene una barba larga, tiene un maleta masivo, y habla urgentemente en su Motorola DynaTAC 8000X.\n%s escucha palabras estranas. %s necessita ________", Player.getName(), Player.getCharacter().getWorkplace(), Player.getName(), Player.getName()),

                            new String[] {
                                String.format("Caminar a %s", Player.getCharacter().getWorkplace()),
                                "ATAQUE EL MUSULMAN!"
                            }
                        )
                    )
                );
                break;
            case "1#1":
            case "2#1":
            case "3#1":
                Player.changeScore(10);
                appendChoice('#');
            case "1#2":
            case "2#2":
            case "3#2":
                Player.changeScore(-10);
                appendChoice('#');
            case "1#1#":
            case "2#1#":
            case "3#1#":
            case "1#2#":
            case "2#2#":
            case "3#2#":
                Utils.coolPrint("La maleta se abri - tenio muchas botellas.\nLos botellas tenia medicinas para la hija pequeno de el musulman.\nSu hija es enfermo - tiene un enfermo horible, y el musulman solo queria tomar medicinas\npara su hija. Hable con su esposa sobre la condicion critical de la hija.", 10);
                if (getChoices().charAt(getChoices().length() - 2) == '2') {
                    Utils.coolPrint("En el telefono, la madre grita: 'ERA MUERTE!! ERA MUERTE!!' Pero, despues de ataque, el musulman no tiene conciencia.", 10);
                } else {
                    Utils.coolPrint("En la telefono, la madre grita: 'VA A NUESTRO CASA AHORA!!'", 10);
                }
                Utils.coolPrint("%s estaba vale");
                isDone();

            default:
                Utils.coolPrint(String.format("%c no es un option verdad!\n", getChoices().charAt(getChoices().length() - 1)), 10);
                undoLastChoice();
                break;
        }
    }

}

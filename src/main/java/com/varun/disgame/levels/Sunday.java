package com.varun.disgame.levels;

import com.varun.disgame.Utils;
import com.varun.disgame.player.*;

public class Sunday extends Level {
    public void start() {
        Utils.coolPrint(Utils.genLevelTitle("Domingo", "4 Febrero 2018"), 20);
        while(!(isDone())) {
            loop();
        }
        Player.setLevel(new Monday());
        Player.play();
    }

    public void loop() {
        switch(getChoices()) {
            case "":
                appendChoice(
                    Utils.readChar(
                        Utils.storyPrompt(
                            String.format("8:00 AM  >> < la alarma de %s sona >\n", Player.getName()), new String[] {
                                "Snooze", 
                                "Dismiss"
                            }
                        )
                    )
                );
                break;
            case "1":
                Utils.coolPrint(String.format("8:10 AM  >> < %s levantanse >\n", Player.getName()), 10);
                appendChoice('#');
                break;
            case "2":
                Utils.coolPrint(String.format("8:01 AM  >> < %s levantanse >\n", Player.getName()), 10);
                appendChoice('#');
                break;
            case "1#":
            case "2#":
                Utils.coolPrint(
                    String.format("8:15 AM  >> < %s se cepillarse los dientes >\n8:20 AM  >> < %s se ducharse >\n8:35 AM  >> < %s de desayunarse >\n", Player.getName(), Player.getName(), Player.getName()),
                    10
                );
                appendChoice(
                    Utils.readChar(
                        Utils.storyPrompt(
                            String.format("9:00 AM  >> < Un amigo negro de %s llama en el telefono >\nAmigo: 'Quiero almuerzo con tu - donde quieres?'\n", Player.getName()), new String[] {
                                "KFC porque el amigo es negro"
                            }
                        )
                    )
                );
                break;

            case "1#1":
            case "2#1":
                Utils.coolPrint(
                    String.format("Amigo: Discriminacion!\n%s: No soy un racisto!\n", Player.getName()), 10
                );
                appendChoice(
                    Utils.readChar(
                        Utils.storyPrompt(
                            String.format("Amigo: Debias probarlo!\n"),
                            new String[] {
                                "Vale",
                                "Er... vale?",
                                "No me encanta la idea, pero vale."
                            }
                        )
                    )
                );

                break;
            case "1#11":
            case "2#11":
            case "1#12":
            case "2#12":
            case "1#13":
            case "2#13":
                Utils.coolPrint(
                    String.format("Amigo: Bien!\n"), 10
                );
                setDone();
                break;

            default:
                Utils.coolPrint(String.format("%c no es un option verdad!\n", getChoices().charAt(getChoices().length() - 1)), 10);
                undoLastChoice();
                break;
        }
    }

}

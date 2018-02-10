package com.varun.disgame.levels;

import com.varun.disgame.Utils;
import com.varun.disgame.player.*;

public class Sunday extends Level {
    public void start() {
        Utils.coolPrint(Utils.genLevelTitle("Domingo", "25 Febrero 2018"), 20);
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
                            String.format("8:00 AM >> <la alarma de %s sona>\n", Player.getName()), new String[] {
                                "Snooze", 
                                "Dismiss"
                            }
                        )
                    )
                );
                break;
            case "1":
                Utils.coolPrint(String.format("8:10 AM >> <%s levantanse>\n", Player.getName()), 10);
                appendChoice('#');
                break;
            case "2":
                Utils.coolPrint(String.format("8:01 AM >> <%s levantanse>\n", Player.getName()), 10);
                appendChoice('#');
                break;
            case "1#":
            case "2#":
                Utils.coolPrint(
                    String.format("8:15 AM >> <%s se cepillarse los dientes>\n8:20 AM >> <%s se ducharse>\n8:35 AM >> <%s de desayunarse>", Player.getName(), Player.getName(), Player.getName()), 
                    10
                );
                appendChoice(
                    Utils.readChar(
                        Utils.storyPrompt(
                            String.format("9:00 AM >> <Un >\n", Player.getName()), new String[] {
                                "Snooze", 
                                "Dismiss"
                            }
                        )
                    )
                );

            
            default:
                Utils.coolPrint(String.format("%c no es un option verdad!\n", getChoices().charAt(getChoices().length() - 1)), 10);
                undoLastChoice();
                break;
        }
    }

}
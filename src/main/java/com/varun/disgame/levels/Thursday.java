package com.varun.disgame.levels;

import com.varun.disgame.Utils;
import com.varun.disgame.player.Player;

public class Thursday extends Level {
    public void start() {
        Utils.coolPrint(Utils.genLevelTitle("Jueves", "28 Febrero 2018"), 20);
        while(!(isDone())) {
            loop();
        }
        Player.setLevel(new Friday());
        Player.play();

    }

    public void loop() {
        switch(getChoices()) {
            case "":
                Utils.coolPrint(String.format("6:30 AM  >> %s: 'Me duele la cabeza... no quiero ir a la %s ahoy.'\n", Player.getName(), Player.getCharacter().getWorkplace()), 10);
                Utils.coolPrint(String.format("Jefe: 'Si - a estas enfermo, no necessitas va a %s ahoy.'\nJefe: 'Pero, necessitas consultar en la telefono con nuestro clientes! :)\n", Player.getCharacter().getWorkplace()), 10);
                appendChoice('#');
                break;
            case "#":
                appendChoice(
                    Utils.readChar(
                        Utils.storyPrompt(
                            String.format(
                                "Primero Cliente: Una Chica: 'Mi computadora es muy lento!'\n"
                            ),
                            new String[] {
                                "'Es porque eras una chica! Todos los chicas son mal con computadoras!",
                                "'Es porque tenias 60000 programas mal. Necesitas ''Troglodytarum Antivirus''. '"
                            }
                        )
                    )
                );
                break;
            case "#1":
                Player.changeScore(-1);
                Utils.coolPrint("La Chica: 'No - tengo una amigo quien es una programadora!'\n", 10);
                setChoices("##");
                setDone();
                break;
            case "#2":
                Player.changeScore(1);
                Utils.coolPrint("La Chica: 'Gracias!\n", 10);
                setChoices("##");
                setDone();
                break;
            default:
                Utils.coolPrint(String.format("%c no es un option verdad!\n", getChoices().charAt(getChoices().length() - 1)), 10);
                undoLastChoice();
                break;
        }
    }

}

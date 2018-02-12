package com.varun.disgame.levels;

import com.varun.disgame.Utils;
import com.varun.disgame.player.Player;

/**
 * Created by yetski on 2/12/2018.
 */
public class Saturday extends Level{

    private int finalScore;

    public void start(){
        finalScore = (int) Player.getScore();
        Utils.coolPrint(Utils.genLevelTitle("Sabado", "10 Febrero 2018"), 20);
        Utils.coolPrint(String.format("< El amigo negro de %s salta detras de una planta > \n", Player.getName()), 10);
        Utils.coolPrint(String.format("%s: 'Aiiiiii!'\n", Player.getName()), 10);
        Utils.coolPrint(String.format("Amigo: 'Te estaba mirando todo este tiempo!'\n", Player.getName()), 10);
        Utils.coolPrint(String.format("Amigo: 'Ademas, te he dado un puntaje por tu racismo.\n"), 10);
        Utils.coolPrint(String.format("Amigo: 'Tu puntaje es: %d'\n", finalScore), 10);
        String racistStatus;
        if (finalScore < 1) {
            racistStatus = String.format("Amigo: %s, eras un racisto muy horible.\n", Player.getName());
        } else {
            racistStatus = String.format("Amigo: %s, no eras un racisto - es una persona buena!\n");
        }
        Utils.coolPrint(racistStatus, 10);

        /*
        Utils.coolPrint(String.format("8:10 AM  >> < %s levantarse >\n8:15 AM >> <%s recibió un mensaje de texto de su amigo>\nAmigo: venga afuera ", Player.getName(), Player.getName()), 10);
        Utils.coolPrint(String.format("8:30 AM  >> < %s camina afuera y hablo con su amigo >\nAmigo: Te he estado mirando durante la última semana y", Player.getName()), 10);
        Utils.coolPrint("..............................\n",30);
        if((int)Math.signum((double)finalScore) < 0){
            if(finalScore < 6){
                Utils.coolPrint("Ya no somos amigos .......", 70);
            }else{
                Utils.coolPrint("Debes trabajar para no ser racista.......", 40);
            }
        } else {
            switch (finalScore) {
                case (0):
                    Utils.coolPrint("No eres racista, pero tampoco eres una gran persona. \nEres una persona promedio.", 10);
                    break;
                case (1):
                    Utils.coolPrint("La gente sabe quién eres por lo amable que eres, \npero aún saben que eres racista.", 10);
                    break;
                case (2):
                    Utils.coolPrint("Tu Sabes cuándo ayudar e intentar no ser racista.\n Entonces tu eres una bien persona pero tu eres promedio", 10);
                    break;
                case (3):
                    Utils.coolPrint("Usted habla con palabras amables y \nhace todo lo posible para no ser racista, pero a veces se equivoca.", 10);
                    break;
                case (4):
                    Utils.coolPrint("Usted habla con palabras amables y \nhace todo lo posible para no ser racista, pero a veces se equivoca.", 10);
                    break;
                case (5):
                    Utils.coolPrint("Usted habla con palabras amables y \nhace todo lo posible para no ser racista, pero a veces se equivoca.", 10);
                    break;
                case (6):
                    Utils.coolPrint("Solo hiciste algo racista una vez. Buen trabajo.", 10);
                    break;
                case (7):
                    Utils.coolPrint("Eres la persona más amable y compasiva que conozco. \nNunca dices nada racista y has estado ayudando a todos, \nindependientemente de su raza.", 10);
                    break;


            }
        }*/
        Utils.coolPrint("\n+------------------------------+\n", 30);
        Utils.coolPrint("|  El Juego De Discriminacion  |\n", 30);
        Utils.coolPrint("|     De Varun y Danzel        |\n", 30);
        Utils.coolPrint("+------------------------------+\n\n", 30);
    }

    //no need for loop
    public void loop(){
    }

}

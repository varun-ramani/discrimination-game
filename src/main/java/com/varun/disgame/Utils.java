package com.varun.disgame;
import java.util.Scanner;
public class Utils {
    private static Scanner scan = new Scanner(System.in);

    public static String readString(String prompt) {
        coolPrint(prompt, 10);
        return scan.nextLine();
    }

    public static int readInt(String prompt) {
        System.out.println(prompt);
        int toReturn = scan.nextInt();
        scan.nextLine();
        return toReturn;
    }

    public static char readChar(String prompt) {
        return readString(prompt).charAt(0); // lel
    }

    public static String genHeader(String title) {
        String build = title;
        build += "\n";
        
        for (int i = 0; i < title.length(); i++) {
            build += "=";
        }

        build += "\n";

        return build;
    }

    public static void coolPrint(String toPrint, long time) {
        for (int i = 0; i < toPrint.length(); i++) {
            print(toPrint.charAt(i));
            try {
                Thread.sleep(time);
            } catch (Exception e){
                // Yup - we're officially screwed if the program ever reaches this point
            }
        }
    }

    public static String genLevelTitle(String day, String date) {
        return genHeader(day + ", " + date);
    }

    public static void println(Object toPrint) {
        System.out.println(toPrint);
    }

    public static void print(Object toPrint) {
        System.out.print(toPrint);
    }

    public static String storyPrompt(String story, String[] options) {
        String build = story + "\n"; 
        
        for (int i = 0; i < options.length; i++) {
            build += String.format("\t%d. %s\n", i + 1, options[i]);    
        }
        
        build += "> ";

        return build;

    }
}
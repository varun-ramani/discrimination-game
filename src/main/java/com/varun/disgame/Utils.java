package com.varun.disgame;
import java.util.Scanner;
public class Utils {
    private static Scanner scan = new Scanner(System.in);
    public static String readString(String prompt) {
        System.out.print(prompt);
        return scan.nextLine();
    }
    public static int readInt(String prompt) {
        System.out.println(prompt);
        int toReturn = scan.nextInt();
        scan.nextLine();
        return toReturn;
    }

    public static void genHeader(String title) {
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("=");
        }
    }
}
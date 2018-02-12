package com.varun.disgame.player.character;

public class Character {
    protected String workplace;
    protected String jobTitle;
    protected String jobVerb;

    public class Conjugations {
        public static final int I = 1;
        public static final int YOU = 2;
        public static final int EL_ELLA_USTED = 3;
        public static final int NOSOTROS = 4;
        public static final int ELLOS_ELLAS_USTEDES = 5;
    }

    public String getJobVerb(int conjugation) {
        String verbStem = jobVerb.substring(0, jobVerb.length() - 2);
        char conjugationLetter = jobVerb.charAt(jobVerb.length() - 2);
        String i_conjugation = "o";
        String you_conjugation = (conjugationLetter + "s");
        String eeu_conjugation = conjugationLetter + "";
        String nosotros_conjugation = ((conjugationLetter == 'e' || conjugationLetter == 'i') ? 'i' : 'a') + "mos";
        String eeu_plural_conjugation = conjugationLetter + "n";

        switch(conjugation) {
            case 1:
                return verbStem + i_conjugation;
            case 2:
                return verbStem + you_conjugation;
            case 3:
                return verbStem + eeu_conjugation;
            case 4:
                return verbStem + nosotros_conjugation;
            case 5:
                return verbStem + eeu_plural_conjugation;
        }

        return jobVerb;
    }

    public String getWorkplace() {
        return workplace;
    }

    public String getJobTitle() {
        return jobTitle;
    }

}

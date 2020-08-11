package com.company;

import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n" +
                " __   __  _______  _______  _______  _______  ______    __   __  ___   __    _  ______  \n" +
                "|  |_|  ||   _   ||       ||       ||       ||    _ |  |  |_|  ||   | |  |  | ||      | \n" +
                "|       ||  |_|  ||  _____||_     _||    ___||   | ||  |       ||   | |   |_| ||  _    |\n" +
                "|       ||       || |_____   |   |  |   |___ |   |_||_ |       ||   | |       || | |   |\n" +
                "|       ||       ||_____  |  |   |  |    ___||    __  ||       ||   | |  _    || |_|   |\n" +
                "| ||_|| ||   _   | _____| |  |   |  |   |___ |   |  | || ||_|| ||   | | | |   ||       |\n" +
                "|_|   |_||__| |__||_______|  |___|  |_______||___|  |_||_|   |_||___| |_|  |__||______| \n");
        Scanner sc = new Scanner(System.in);
        String[] objects = {"blau", "rot", "gelb", "grün", "schwarz", "weiss", "lila", "orange"};
        System.out.println("Willkommen bei Mastermind! \n" +
                "Dein Ziel ist es, eine Farbenkombination aus 4 Farben herauszufinden.\n" +
                "Dazu hast du 12 Runden zur Verfügung.\n" +
                "Gib eine Farbe ein und drücke Enter." );

        Random r = new Random();
        String[] colors = new String[4];

        for (int i = 0; i < 4; i++) {
            int randomNumber = r.nextInt(objects.length);
            System.out.println(objects[randomNumber]);
            colors[i] = (objects[randomNumber]);
        }

        for (int spieldauer = 1; spieldauer <= 12; spieldauer++) {

            int redpoints = 0;
            int whitepoints = 0;
            String tryagain;

            System.out.println("------------------------------------- " + "Runde " + (spieldauer) + " ------------------------------------------");
            System.out.println("Zur Verfügung stehende Farben: blau, rot, gelb, lila, weiss, schwarz, orange, grün");
            String[] eingaben = new String[4];
            String clone_colors[] = colors.clone();
            System.out.println("Gib eine Farbenkombination ein...");
            for (int i = 0; i < 4; i++) {
                eingaben[i] = sc.nextLine();

                switch (eingaben[i]) {
                    case "blau":
                        break;
                    case "rot":
                        break;
                    case "gelb":
                        break;
                    case "grün":
                        break;
                    case "schwarz":
                        break;
                    case "weiss":
                        break;
                    case "lila":
                        break;
                    case "orange":
                        break;
                    default:
                        System.out.println("Falsche Eingabe. Bitte gib erneut deine Farben ein.");
                        i = -1;
                        break;
                }
            }

            String clone_eingaben[] = eingaben.clone();

            //Ausgabe rote Punkte
            for (int i = 0; i < 4; i++) {
                if (clone_eingaben[i].equals(clone_colors[i])) {
                    redpoints = redpoints + 1;
                }
            }

            //Ausgabe weisse Punkte
            if (clone_eingaben[0].equals(clone_colors[0])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[0] = "";
                clone_colors[0] = "0";
            } else if (clone_eingaben[0].equals(clone_colors[1])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[0] = "";
                clone_colors[1] = "1";
            } else if (clone_eingaben[0].equals(clone_colors[2])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[0] = "";
                clone_colors[2] = "1";
            } else if (clone_eingaben[0].equals(clone_colors[3])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[0] = "";
                clone_colors[3] = "1";
            }

            if (clone_eingaben[1].equals(clone_colors[0])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[1] = "";
                clone_colors[0] = "0";
            } else if (clone_eingaben[1].equals(clone_colors[1])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[1] = "";
                clone_colors[1] = "1";
            } else if (clone_eingaben[1].equals(clone_colors[2])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[1] = "";
                clone_colors[2] = "1";
            } else if (clone_eingaben[1].equals(clone_colors[3])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[1] = "";
                clone_colors[3] = "1";
            }

            if (clone_eingaben[2].equals(clone_colors[0])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[2] = "";
                clone_colors[0] = "0";
            } else if (clone_eingaben[2].equals(clone_colors[1])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[2] = "";
                clone_colors[1] = "1";
            } else if (clone_eingaben[2].equals(clone_colors[2])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[2] = "";
                clone_colors[2] = "1";
            } else if (clone_eingaben[2].equals(clone_colors[3])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[2] = "";
                clone_colors[3] = "1";
            }

            if (clone_eingaben[3].equals(clone_colors[0])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[3] = "";
                clone_colors[0] = "0";
            } else if (clone_eingaben[3].equals(clone_colors[1])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[3] = "";
                clone_colors[1] = "1";
            } else if (clone_eingaben[3].equals(clone_colors[2])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[0] = "";
                clone_colors[2] = "1";
            } else if (clone_eingaben[3].equals(clone_colors[3])) {
                whitepoints = whitepoints + 1;
                clone_eingaben[3] = "";
                clone_colors[3] = "1";
            }

            System.out.println("Korrekt positionierte Farben (rote Punkte):  |" + redpoints + "|");
            System.out.println("Vorkommende Farben (weisse Punkte):          |" + (whitepoints - redpoints) + "|");

            if (redpoints == 4) {
                System.out.println(" (\\______/)\n" +
                        "( ͡ ͡° ͜ ʖ ͡ ͡°)\n" +
                        " \\╭☞ \\╭☞");
                System.out.println("Du hast gewonnen!");
                System.out.println("Willst du noch einmal spielen? (ja/nein)");
                tryagain = sc.nextLine();
                if (tryagain.equals("ja") || tryagain.equals("Ja")) {
                    spieldauer = 0;
                    for (int i = 0; i < 4; i++) {
                        int randomNumber = r.nextInt(objects.length);
                        System.out.println(objects[randomNumber]);
                        colors[i] = (objects[randomNumber]);
                    }
                } else if (tryagain.equals("nein") || tryagain.equals("Nein")) {
                    System.out.println("Danke fürs spielen!");
                    break;
                } else {
                    System.out.println("Falsche Eingabe");
                    break;
                }
            }

            if (spieldauer == 12) {
                System.out.println("Du hast verloren :(");
                System.out.println("Deine Lösung war:                            " + Arrays.toString(eingaben));
                System.out.println("Das war die richtige Lösung:                 " + Arrays.toString(colors));
                System.out.println("Möchtst du nochmals spielen? (ja/nein)");

                tryagain = sc.nextLine();
                if (tryagain.equals("ja") || tryagain.equals("Ja")) {
                    spieldauer = 0;
                    for (int i = 0; i < 4; i++) {
                        int randomNumber = r.nextInt(objects.length);
                        System.out.println(objects[randomNumber]);
                        clone_colors[i] = (objects[randomNumber]);
                    }
                } else if (tryagain.equals("nein") || tryagain.equals("Nein")) {
                    System.out.println("Danke fürs Spielen!");
                    break;
                } else {
                    System.out.println("Falsche Eingabe");
                    break;
                }
            }
        }
    }
}



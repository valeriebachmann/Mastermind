package com.company;
import java.util.Random;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // vier Farben generieren

        String[] objects = {"blau", "rot", "gelb", "grün", "schwarz", "weiss", "lila", "orange"};

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
                int randomNumber = r.nextInt(objects.length);
                System.out.println(objects[randomNumber]);
            }


        //Benutzerdefinierte Eingabe


        Scanner sc = new Scanner(System.in);
        int[] colors = new int[3];

        System.out.println("Gib eine Farben Konbination ein...");
        String[] eingaben = new String[4];
        for(int i = 0; i < 4; i++){
            eingaben[i] = sc.nextLine();

            switch (eingaben[i]){
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
                    System.out.println("Falsche Einabe");
                    i = -1;
                    break;
            }
        }
    }
}


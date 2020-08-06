package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // vier Farben generieren

        String[] objects = {"Blau", "Rot", "Gelb", "Grün", "Schwarz", "Weiss", "Lila", "Orange"};

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
                int randomNumber = r.nextInt(objects.length);
                System.out.println(objects[randomNumber]);
            }
        }

        //Benutzerdefinierte Eingabe

    }

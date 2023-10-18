package org.lessons.java;

import java.util.Scanner;

public class FestaACasaFerragnez {
    public static void main(String[] args) {
        Scanner nameScan = new Scanner(System.in);
        String nomeInvitato;
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Insert your name and surname");
        nomeInvitato = nameScan.nextLine();
        nameScan.close();

        for (int i = 0; i < listaInvitati.length; i++) {
            if (nomeInvitato.equals(listaInvitati[i])) {
                System.out.println("your name: " + nomeInvitato + " found");
            } else {
                System.out.println("your name: " + nomeInvitato + " not found");
            }
        }
    }
}

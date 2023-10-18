package org.lessons.java;

import java.util.Scanner;

public class CheckGuests {
    public static void main(String[] args) {
        Scanner nameScan = new Scanner(System.in);
        String guestName;
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};


        System.out.println("Insert your name and surname");
        guestName = nameScan.nextLine();
        nameScan.close();
        boolean isAuthorized = false;

        for (int i = 0; i < guests.length; i++) {

            if (guestName.equals(guests[i])) {
                isAuthorized = true;
                break;
            }
        }
        if (isAuthorized){
            System.out.println("Allowed");
        } else {
            System.out.println("not Allowed");
        }
    }
}

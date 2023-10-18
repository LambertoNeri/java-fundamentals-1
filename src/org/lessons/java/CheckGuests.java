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


//        for (int i = 0; i < guests.length; i++) {
//
//            if (guestName.equals(guests[i])) {
//                isAuthorized = true;
//                break;
//            }
//        }
//        if (isAuthorized){
//            System.out.println("Allowed");
//        } else {
//            System.out.println("not Allowed");
//        }

        boolean isAuthorized = false;
        int num = 0;


        while(num < guests.length){

            if (guestName.equals(guests[num])) {
                isAuthorized = true;
                break;
            }
            num++;
        }

        if (isAuthorized){
           System.out.println("Allowed");
        } else {
           System.out.println("not Allowed");
        }
    }
}

package org.lessons.java;

import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        int distance;
        int age;
        double priceMultiplier =  0.21;
        double discount18 =  .20;
        double discount65 =  .40;
        double price;

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert how many km you want to travel");
        distance = scan.nextInt();
        System.out.println("Insert your age");
        age = scan.nextInt();

        if(age < 18) {
            price = (distance * priceMultiplier);
            System.out.println("under 18 discount detected, the price of your ticket is " + (price - (price * discount18)) + "$");
        } else if (age >65) {
            price = (distance * priceMultiplier);
            System.out.println("over 65 discount detected, the price of your ticket is " + (price - (price * discount65)) + "$");
        } else {
            price = (distance * priceMultiplier);
            System.out.println("no discount were made, the price of your ticket is " + price +"$");
        }

    }
}

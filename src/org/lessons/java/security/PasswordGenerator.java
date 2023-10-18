package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String name;
        String surname;
        String favouriteColor;
        int day;
        int month;
        int year;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to password generator please insert your Name");
        name =  scan.nextLine();
        System.out.println("insert your Surname");
        surname =  scan.nextLine();
        System.out.println("insert your favourite color");
        favouriteColor =  scan.nextLine();
        System.out.println("insert your birth day");
        day =  scan.nextInt();
        System.out.println("insert your month of birth");
        month =  scan.nextInt();
        System.out.println("insert your year of birth");
        year =  scan.nextInt();

        System.out.println("Your personalized password is " + name + "-" + surname + "-" + favouriteColor + "-" + (day+month+year));

    }
}

package org.lessons.java;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 0; i < 101 ; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("numero: "+ i + " = FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("numero: " + i + " = Buzz");
            } else if ( i % 3 == 0 ) {
                System.out.println("numero: " + i + " = Fizz");
            } else  {
                System.out.println("numero:" + i );
            }
        }
    }
}

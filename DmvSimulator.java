package DmvSimulator;

import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV! Please get in line and grab a number");

        Random random = new Random();
        int ran = random.nextInt(201 - 100) + 100;

        System.out.println("Your number is " + ran + ".\nPlease go sit down and wait until your number is called");

        int number = ran; 

        for (int i = 1; (ran + i) != number; i++) {
            if ((ran + i) > 200) {
                ran = 0;
                i = 1;
            }
            System.out.println((ran + i) + " is up next. Please come to the counter");
        }

        System.out.println(number + " is up next. (That's you!) Please come to the counter");
        System.out.println("It would appear you don't have the required paperwork. What are you, stupid?\nGoodbye!");
    }   
}

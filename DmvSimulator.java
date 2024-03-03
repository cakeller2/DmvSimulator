package DmvSimulator;

import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV! Please get in line and grab a number");

        Random random = new Random();
        int ran = random.nextInt(101 - 1) + 1;

        System.out.println("Your number is " + ran + ".\nPlease go sit down and wait until your number is called");
    }
}

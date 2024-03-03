package DmvSimulator;

import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV! Please get in line and grab a number");

        Random random = new Random();
        int ran = random.nextInt(101 - 1) + 1;

        System.out.println("Your number is " + ran + ".\nPlease go sit down and wait until your number is called");

        int number = ran; 

        for (int i = 1; (ran + i) != number; i++) {
            if ((ran + i) > 100) {
                ran = 0;
                i = 1;
            }
            System.out.println((ran + i) + " is up next. Please come to the counter");
        }

        System.out.println(number + " is up next. (That's you!) Please come to the counter");
    }   
}

/*Call out each number one at a time, but be sure to start from the number directly after the one
you gave to the user and then wrap around until the user’s number is finally called last*/

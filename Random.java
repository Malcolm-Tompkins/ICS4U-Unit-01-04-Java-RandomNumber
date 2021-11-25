/*
* Runs the guess the number game
*/

import java.util.Scanner;
/**
* Class Random.
*/

final class Random {
    /**
    * Constant for magic number 1.
    */
    public static final int NUMBER_ONE = 1;

    /**
    * Constant for magic number 6.
    */
    public static final int NUMBER_SIX = 6;

    /**
    * Constant for magic number 0.
    */
    public static final int NUMBER_ZERO = 0;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Random() {
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // Generating random number
        final int min = NUMBER_ONE;
        final int max = NUMBER_SIX;

        // From:
        // https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java

        final int randomNumber = (int) Math.floor(Math.random() * (
            max - min + 1) + min);
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        int loopCounter = NUMBER_ZERO;
        while (true) {
            try {
                System.out.println("Guess a number from 1-6");
                final int userNumber = myObj.nextInt();
                // Process
                loopCounter++;
                if (userNumber == randomNumber) {
                    System.out.println("You have guessed correctly!");
                    System.out.println("It took you " + loopCounter + " tries");
                    break;
                } else {
                    // Output
                    System.out.println("Guess was incorrect");
                    if (userNumber > randomNumber) {
                        System.out.println("Your guess was too high");
                    } else if (userNumber < randomNumber) {
                        System.out.println("Your guess was too low");
                    }
                }
            } catch (java.util.InputMismatchException error) {
                System.out.println("Invalid number");
                break;
            }
        }
    }
}


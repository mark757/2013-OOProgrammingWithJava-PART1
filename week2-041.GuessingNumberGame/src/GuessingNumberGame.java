
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!

        int numGuess = 0;
        int counter = 1;
        while (numGuess != numberDrawn){
            System.out.print("Guess a number: ");
            numGuess = Integer.parseInt(reader.nextLine());
            if (numGuess < numberDrawn) {
                System.out.println("The number is greater," + " guesses made: " + counter);
            }else if (numGuess > numberDrawn){
                System.out.println("The number is lesser," + " guesses made: " + counter);
            }
            counter++;
            continue;
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}

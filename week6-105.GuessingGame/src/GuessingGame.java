import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, otherwise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        // write the guessing logic here

        while (lowerLimit != upperLimit) {

            if (isGreaterThan(average(lowerLimit, upperLimit)) == true) {
                //if yes the lower limit = 50 and the upper limit is 100.
                lowerLimit = average(lowerLimit+1, upperLimit+1);


            } else {
                //if no the lower limit = 0 and the upper limit is 50.
                upperLimit = average(lowerLimit, upperLimit); //50


                }

            }
        System.out.println("The number you're thinking of is " + upperLimit + ".");


    }


    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        if (reader.next().equalsIgnoreCase("y")) {
            return true;
        }
       else return false;

    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

}

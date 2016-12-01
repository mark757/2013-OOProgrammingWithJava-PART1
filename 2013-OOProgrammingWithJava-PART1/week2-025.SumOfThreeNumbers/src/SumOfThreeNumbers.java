
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        // Write your program here
        // Use only variables sum and read
        System.out.println("Type the first number: ");
        int numOne = Integer.parseInt(reader.nextLine());

        System.out.println("Type the second number: ");
        int numTwo = Integer.parseInt(reader.nextLine());

        System.out.println("Type the third number: ");
        int numThree = Integer.parseInt(reader.nextLine());

        read = numOne + numTwo + numThree;

        sum = read;

        System.out.println("Sum: " + sum);
    }
}


import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int n = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int sum = 0;

        while (counter <= n){

        sum = sum + counter;

        counter++;

        }
        System.out.println("the sum is " + sum);

    }
}



import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int counter = 0;
        int sum = 0;

        while (counter <= number){
            int pow = (int)Math.pow(2, counter);
            sum += pow;
            counter++;
        }
        System.out.println(sum);
    }
}

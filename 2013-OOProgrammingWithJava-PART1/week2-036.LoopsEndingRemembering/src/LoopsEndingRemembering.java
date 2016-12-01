import java.math.BigDecimal;
import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int numbers = 0;
        int sum = 0;
        int counter = 0;
        double average = 0.0;
        int even = 0;
        int odd = 0;

        while (numbers != -1){
            numbers = Integer.parseInt(reader.nextLine());

            if (numbers % 2 == 0){
                even++;
            };
            if (numbers % 2 == 1){
                odd++;
            }
            if (numbers == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            sum += numbers;
            counter++;
            average = (double)sum / (double)counter;

        }
        System.out.println("The sum is: " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

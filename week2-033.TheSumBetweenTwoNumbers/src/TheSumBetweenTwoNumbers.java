
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 0;
       while (counter != (second - first)+1){
           sum += first + counter;
           counter++;
       }
        System.out.println(sum);
    }
}


import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        float num1 = Float.parseFloat(reader.nextLine());

        System.out.println("Type another number: ");
        float num2 = Float.parseFloat(reader.nextLine());

        float ans = num1 / num2;

        System.out.println("Division: " + num1 + " / " + num2 + " = " + ans);
    }
}

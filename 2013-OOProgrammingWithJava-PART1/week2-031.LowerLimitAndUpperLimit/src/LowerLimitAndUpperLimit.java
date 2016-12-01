
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.println("Second number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        if (numberOne > numberTwo){
            System.out.println("");
           /* while (numberOne > numberTwo){
                System.out.println(numberOne);
                numberOne--;
            } */
        }

        while (numberOne < numberTwo+1){
            System.out.println(numberOne);
            numberOne++;
            if (numberOne == numberTwo+1){
                break;
            }

        }

    }
}

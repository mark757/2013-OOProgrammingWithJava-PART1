
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.println("Enter your floating numbers. ");
            double value = Double.parseDouble(reader.nextLine());

            if (value < -30.0 || value > 40.0){
                continue;
            }
            else
            Graph.addNumber(value);


            // Graph is used as follows:
        /*    Graph.addNumber(7);
            double value = 13.5;
            Graph.addNumber(value);
            value = 3;
            Graph.addNumber(value);
            // Remove or comment out these lines above before trying to run the tests.

         */
        }
    }
}

import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        String help = "";
        String helpTwo = "";
        int hLength = 0;
        while(hLength < text.length()){
            helpTwo = text.substring(text.length() - hLength - 1, text.length() - hLength);
            help = help + helpTwo;
            hLength++;
        }
        // note that method does now print anything, it RETURNS the reversed string
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}

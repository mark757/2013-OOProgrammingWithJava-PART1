
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.print("Type your name: ");
        System.out.println("Number of characters: " + calculateCharacters(reader.nextLine()));
    }
    // do here the method
    public static int calculateCharacters(String text){
        //System.out.println(text.length());
        return text.length();
    }
    
}
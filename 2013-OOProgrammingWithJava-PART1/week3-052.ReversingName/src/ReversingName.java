import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int counter = name.length();

        System.out.print("In reverse order: ");
        while (counter > 0){
            System.out.print(name.charAt(counter-1));
            counter--;
        }
    }

}
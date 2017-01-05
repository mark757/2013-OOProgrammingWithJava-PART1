import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");

        int counter = 0;
        //int number = 1;
        String name = reader.nextLine();
        while (counter < 3){
            if (name.length() < 3){
                break;
            }
        System.out.println(counter+1 + ". character: " + name.charAt(counter));
        counter++;


        }

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> list = new ArrayList<>();

        System.out.print("? ");
        String command = scanner.nextLine();

        while (!command.contains("Quit")) {

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Latin Name: ");
                String latin = scanner.nextLine();

                Bird birds = new Bird(name, latin);
                list.add(birds);

            }
            if (command.equals("Statistics")) {
                for (Bird name : list) {
                    System.out.println(name);
                }

            }
            if (command.equals("Show")) {
                System.out.println("What? ");
                String search = scanner.nextLine();

                for (Bird name : list) {
                    if (search.contains(name.getName())) {
                        System.out.println(name);
                    } else if (!search.contains(name.getName())) {
                        System.out.println("Is not a bird!");
                    }
                }
            }

            if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String observed = scanner.nextLine();

                for (Bird name : list) {
                    if (observed.contains(name.getName())) {
                        name.increaseObserve();
                    }
                }

            }
            System.out.print("? ");
            command = scanner.nextLine();
        }
    }
}



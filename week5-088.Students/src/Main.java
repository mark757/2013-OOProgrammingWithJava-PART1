
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("name: ");
            String name = input.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.println("student number: ");
            String studentNumber = input.nextLine();

            list.add(new Student(name, studentNumber));

            // OR do this
            // Student info = new Student(name, studentNumber);
            //list.add(info);
        }

            for (Student students : list) {
                System.out.println(students);
            }


        System.out.println("Give search term: ");
        String term = input.nextLine();

        for (Student stu : list) {
            if (stu.getName().contains(term)) {
                System.out.println("Result: " + stu);
            }
        }
    }
}
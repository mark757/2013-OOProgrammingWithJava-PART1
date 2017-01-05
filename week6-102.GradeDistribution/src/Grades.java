import java.util.Scanner;

/**
 * Created by Mark on 12/14/2016.
 */
public class Grades {
    private String grades0 = "";
    private String grades1 = "";
    private String grades2 = "";
    private String grades3 = "";
    private String grades4 = "";
    private String grades5 = "";

    private int accepted;
    private double percentage;
    private int sum;

    public void getGrades(Scanner scanner) {
        while (true) {
            int points = Integer.parseInt(scanner.nextLine());
            if (points == -1) {
                break;
            } else if (points >= 0 && points < 30) {
                grades0 += "*";
                sum += points;
            } else if (points >= 30 && points < 35) {
                grades1 += "*";
                sum += points;
            } else if (points >= 34 && points <= 39) {
                grades2 += "*";
                sum += points;
            } else if (points >= 40 && points <= 44) {
                grades3 += "*";
                sum += points;
            } else if (points >= 45 && points <= 49) {
                grades4 += "*";
                sum += points;
            } else if (points >= 50 && points <= 60) {
                grades5 += "*";
                sum += points;

            }
        }
    }

    public void printStars() {
        System.out.println("Grade Distribution: ");

        System.out.println("5: " + grades5);
        System.out.println("4: " + grades4);
        System.out.println("3: " + grades3);
        System.out.println("2: " + grades2);
        System.out.println("1: " + grades1);
        System.out.println("0: " + grades0);
    }

    /*
    public void acceptedScores() {
        accepted = grades1.length() + grades2.length() + grades3.length() + grades4.length() + grades5.length();

    }
    */

    public void printScores() {
        //acceptedScores();

        accepted = grades1.length() + grades2.length() + grades3.length() + grades4.length() + grades5.length();

        if (accepted == 0) {
            percentage = 0.0;
        } else {
            percentage = (double)(accepted * 100) / (double)(accepted + grades0.length());
        }
        System.out.println("Acceptance percentage: " + percentage);
    }
}

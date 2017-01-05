
import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
    BoundedCounter seconds = new BoundedCounter(59);
      BoundedCounter minutes = new BoundedCounter(59);
       BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter counter = new BoundedCounter(4);

       System.out.print("seconds: ");
        int s = reader.nextInt(); // read the initial value of seconds from the user
               System.out.print("minutes: ");
      int m = reader.nextInt(); // read the initial value of minutes from the user
             System.out.print("hours: ");
       int h = reader.nextInt(); // read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);


        System.out.println(counter);

        int i = 0;
        while ( i < 121 ) {
            // like in previous but seconds taken into account
            System.out.println(hours + ":" + minutes + ":" + seconds);
            if (minutes.getValue() == 59 && seconds.getValue() == 59) {
                hours.next();
            }

            if (seconds.getValue() == 59) {
                minutes.next();


            }
            seconds.next();
            i++;
        }
    }
}
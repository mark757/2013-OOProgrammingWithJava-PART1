
public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice(12);

        int i = 0;
        while (i < 1000) {
            System.out.println(dice.roll());
            i++;
        }

    }
}

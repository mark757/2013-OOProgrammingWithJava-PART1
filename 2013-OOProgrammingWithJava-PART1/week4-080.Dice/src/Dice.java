import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
      // random = new Random();
    }

    public int roll() {
        while (true){

            int roll = random.nextInt(this.numberOfSides+1);

            if (roll > 0 && roll <= this.numberOfSides){
                return roll;
            }

        }

    }

}

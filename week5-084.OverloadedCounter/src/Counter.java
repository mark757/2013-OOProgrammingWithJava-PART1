/**
 * Created by Mark on 11/20/2016.
 */
public class Counter {
    private int startingValue;
    private boolean check;

        public Counter (int startingValue, boolean check) {

            //this.startingValue = startingValue;
            //this.check = check;

            this.startingValue = startingValue;

            if (check == true) {
                this.check = true;
            } else {
                this.check = false;
            }
        }

    public Counter ( int startingValue){

        //this(startingValue, false);

        this.startingValue = startingValue;
    }

    public Counter (boolean check){
        //this(0, true);

        this.check = check;
        if (this.check == true){
            this.startingValue = 0;

        }
    }

    public Counter(){
        //this(0, false);

        if (this.check == false) {
            this.startingValue = 0;
        }
    }

    /* METHODS */

    public int value(){
        //return this.value;
        return startingValue;
    }

    public void increase(){
        //increase(1);
        startingValue++;
    }

    public boolean check(){
        return check;
    }

    public void increase(int increaseAmount) {

        int sum = startingValue + increaseAmount;
        while (startingValue < sum) {
            if (startingValue < 0){
                break;
            }
            startingValue++;
        }
    }

    public void decrease(){
        startingValue--;


        if (startingValue < 0){
            startingValue = 0;
            if (check == false) {
                startingValue--;
            }

        }

    }

    public void decrease(int decreaseAmount){

        int d = startingValue - decreaseAmount;
        while (startingValue > d) {

            if (startingValue < 1 && check == true){
                break;
            }
            startingValue--;

        }
    }




}

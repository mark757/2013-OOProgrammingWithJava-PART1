/**
 * Created by Mark on 11/17/2016.
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    //private int counter;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        this.value++;
        if (this.value > this.upperLimit){
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if (value < 10){
            return "0" + value;
        }
        return "" + value;
    }
    public int getValue() {
        // write here code that returns the value
        return this.value;
    }
    public void setValue(int value) {
        if(value < 0 || value > upperLimit){
         this.value = 0;
        } else
        this.value = value;
    }
}

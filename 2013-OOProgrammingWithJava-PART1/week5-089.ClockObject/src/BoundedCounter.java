public class BoundedCounter {
    private int value;
    private int upperLimit;


    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        if (this.value == this.upperLimit){
            this.value = 0;
        } else {

            this.value++;
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

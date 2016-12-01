
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;
    //private double average;

    public NumberStatistics(){

        this.amountOfNumbers = amountOfNumbers();
        this.sum = 0;


    }

    public void addNumber(int number){

        sum += number;
        amountOfNumbers++;

    }

    public int amountOfNumbers(){

        return amountOfNumbers;

    }

    public int sum(){
        if (amountOfNumbers == 0){
            return 0;
        }
        return sum;
    }

    public double average(){
        if (amountOfNumbers == 0){
            return 0;
        }
       return (double)sum / (double)amountOfNumbers;

    }
}

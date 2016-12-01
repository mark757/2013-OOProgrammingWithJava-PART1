import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list){
            sum += num;
        }
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = sum(list) / (double)list.size();
        return average;

    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double variance = 0;
        double average = average(list);
        for (double number : list){
            number = Math.pow(average - number, 2) / (list.size() - 1);
            variance += number;
        }
        return variance;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1); list.add(3);
        //list.add(3); list.add(2); list.add(7); list.add(2);
        //list.add(2); list.add(9); list.add(1); list.add(3); list.add(5);


        System.out.println("The variance is: " + variance(list));
    }

}

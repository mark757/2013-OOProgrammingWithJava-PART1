
public class FromOneToHundred {

    public static void main(String[] args) {
        // Write your program here
        while (true) {
            int num = 1;
            while (num <= 100) {
                System.out.println(num);
                num++;

            }
            if (num > 100){
                break;
            }
        }
    }
}

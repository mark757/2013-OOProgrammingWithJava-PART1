import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));

    }

    public static int[] copy(int[] array){
        int arrLength = array.length;
        int[] copyThis = new int[arrLength];

        for (int i = 0; i < array.length; i++){


            copyThis[i] = array[i];
        }

        return copyThis;
    }

    public static int[] reverseCopy(int[] array){
        int arrLength = array.length;
        int[] reverseThis = new int[arrLength];
        int x = 0;

        for (int i = arrLength-1; i >= 0; i--){
            reverseThis[x] = array[i];
            x++;
        }
        return reverseThis;
    }

}

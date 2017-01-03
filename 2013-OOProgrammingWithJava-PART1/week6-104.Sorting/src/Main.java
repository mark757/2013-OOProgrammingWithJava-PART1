import java.util.Arrays;
import java.util.jar.Pack200;

public class Main {
    public static void main(String[] args) {
        // write testcode here

    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }

        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                index = i;
            }

        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        //int smallest = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[index] >= array[i]) {

                index = i;
            }

        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int first = array[index1];
        int second = array[index2];
        for (int i = 0; i < array.length; i++) {
            if (first != second) {
                array[index1] = second;
                array[index2] = first;
            }
        }
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            }


    }

}

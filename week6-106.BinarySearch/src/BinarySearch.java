public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }

            // restrict the search area
            if (searchedValue > array[middle]) {
                beginning = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return false;
    }
}
/*
1. get input
2. if searched value is > middle, then search upper part
3. if searched value is < middle, then search lower part
4. output the answer
 */


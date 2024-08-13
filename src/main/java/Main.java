import tech.lamine.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] tab = {2,1,9,14,5};
        insertionSort.insertionSort(tab);
        System.out.println("Sorted Array "+ Arrays.toString(tab));
    }
}

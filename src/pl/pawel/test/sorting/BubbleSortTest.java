package pl.pawel.test.sorting;

import pl.pawel.main.sorting.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {
    public static void main(String[] args) {
        Random rd = new Random();
        Integer[] array = new Integer[10];
        for(int i = 0; i < 10; i++){
            array[i] = rd.nextInt(100);
        }

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));


        array = BubbleSort.sort(array);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));

    }
}

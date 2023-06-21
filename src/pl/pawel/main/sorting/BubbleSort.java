package pl.pawel.main.sorting;

import static pl.pawel.main.sorting.SortUtils.*;

public class BubbleSort {
    public static <T extends Comparable<T>> T[] sort(T[] array){
        int size = array.length;
        for(int i = 0; i < size - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < size - 1 - i; j++){
                if(greater(array[j], array[j + 1])){
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return array;
    }
}

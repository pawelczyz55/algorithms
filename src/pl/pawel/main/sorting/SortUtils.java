package pl.pawel.main.sorting;

final class SortUtils {
    /* Helper class */
    public static <T> void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <T extends Comparable<T>> boolean greater(T element1, T element2){
        return element1.compareTo(element2) > 0;
    }
}

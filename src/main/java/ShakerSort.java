import java.util.Comparator;

public class ShakerSort {

    public static <T extends Comparable<T>> void shakerSort(T[] arr) {
        int left = 0;
        int right = arr.length-1;
        boolean change = true;
        T value;

        while (left < right && change) {
            change = false;

            for (int i = left, j = right; i < right; i++, j--) {
                if (arr[i].compareTo(arr[i+1]) > 0) {
                    value = arr[i]; arr[i] = arr[i+1]; arr[i+1] = value;
                    change = true;
                }
                if (arr[j].compareTo(arr[j-1]) < 0) {
                    value = arr[j-1]; arr[j-1] = arr[j]; arr[j] = value;
                    change = true;
                }
            }
            right--;
            left++;
        }
    }

    public static <T extends Comparable<T>> void shakerSort(T[] arr, Comparator<T> comparator) {
        int left = 0;
        int right = arr.length-1;
        boolean change = true;
        T value;

        while (left < right && change) {
            change = false;

            for (int i = left, j = right; i < right; i++, j--) {
                if (comparator.compare(arr[i], arr[i+1]) > 0) {
                    value = arr[i]; arr[i] = arr[i+1]; arr[i+1] = value;
                    change = true;
                }
                if (comparator.compare(arr[j], arr[j-1]) < 0) {
                    value = arr[j-1]; arr[j-1] = arr[j]; arr[j] = value;
                    change = true;
                }
            }
            right--;
            left++;
        }
    }
}

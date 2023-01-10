import java.util.Comparator;

public class QuickSort {
    public static <T extends Comparable<T>> void quickSort(T[] arr, int left, int right) {
        if (left < right) {
            int index = (left + right)/2;
            T pivot = arr[index];

            int i = left, j = right;
            while (i <= j) {
                while (arr[i].compareTo(pivot) < 0) i++;
                while (arr[j].compareTo(pivot) > 0) j--;
                if (i <= j) {
                    T value = arr[i];
                    arr[i] = arr[j];
                    arr[j] = value;
                    i++;
                    j--;
                }
            }
            if (left < j) quickSort(arr, left, j);
            if (right > i) quickSort(arr, i, right);
        }
    }


    public static <T extends Comparable<T>> void quickSort(T[] arr, int left, int right, Comparator<T> comparator) {
        if (left < right) {
            int index = (left + right)/2;
            T pivot = arr[index];

            int i = left, j = right;
            while (i <= j) {
                while (comparator.compare(arr[i], pivot) < 0) i++;
                while (comparator.compare(arr[j], pivot) > 0) j--;
                if (i <= j) {
                    T value = arr[i];
                    arr[i] = arr[j];
                    arr[j] = value;
                    i++;
                    j--;
                }
            }
            if (left < j) quickSort(arr, left, j);
            if (right > i) quickSort(arr, i, right);
        }
    }

}

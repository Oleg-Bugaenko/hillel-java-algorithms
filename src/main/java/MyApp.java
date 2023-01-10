import java.util.Arrays;
import java.util.Comparator;

public class MyApp {
    public static void main(String[] args) {
        //shaker sorting algorithm
    // 1.
        Integer[] numbers = {2,5,7,9,1,4,8,3};
        ShakerSort.shakerSort(numbers);
        System.out.println(Arrays.toString(numbers));
    // 2.
        String[] words = {"AAAAA", "WW", "BBB", "Z" };
        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
        ShakerSort.shakerSort(words, comparator);
        System.out.println(Arrays.toString(words));


        //quick sort
    // 1.
        Integer[] numbers1 = {2,5,7,10,1,4,8,3,12,6};
        QuickSort.quickSort(numbers1, 0, numbers1.length-1);
        System.out.println(Arrays.toString(numbers1));

        String[] words1 = {"AAAAA", "WW", "BBB", "Z" };
        Comparator<String> comparator1 = (o1, o2) -> o1.length() - o2.length();
        QuickSort.quickSort(words1, 0 , words1.length-1, comparator1);
        System.out.println(Arrays.toString(words1));



    }
}

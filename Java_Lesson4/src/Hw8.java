import java.util.Arrays;
import java.util.Scanner;

public class Hw8 {
    /**
     * Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
     * In phần tử có số lần xuất hiện nhiều nhất trong a.
     */
    public static void main(String[] args) {
        int[] arr = fillArrayOfIntegers();
        printArrayOfIntegers(arr);
        System.out.print("The most frequent number in an array is: " +mostFrequentNumber(arr));
    }

    private static void printArrayOfIntegers(int[] arr) {
        System.out.println("The elements are: ");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] fillArrayOfIntegers() {
        System.out.print("Enter the number of element(s) = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for( int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static int mostFrequentNumber(int[] arr) {
        int maxcount = 0;
        int element_having_max_freq = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if ( arr[i] == arr [j]) {
                    count++;
                }
            }
            if (count > maxcount ) {
                maxcount = count;
                element_having_max_freq = arr[i];
            }
        }
        return element_having_max_freq;
    }

}
/**
 * The outer loop is used to pick all elements one by one.
 * The inner loop is used to find the frequency of the picked element
 * +> maxcount compares wirh count
 */
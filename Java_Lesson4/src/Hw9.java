import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hw9 {
    /** Random Array
     * Viết chương trình tạo ngẫu nhiên mảng a gồm N phần tử bao gồm các số nguyên.
     * In ra các số khác nhau trong dãy.
     */
    public static void main(String[] args) {
        int[] arr = ArrayOfIntegers();
        System.out.println("Random numbers in an array: ");
        printArrayOfIntegers(arr);
    }
    // N elements: input
    public static int[] ArrayOfIntegers() {
        System.out.print("Enter the number of element(s) = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        return arr;
    }
    //print random numbers
    public static void printArrayOfIntegers(int[] arr) {
        Random randomNumber = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomNumber.nextInt(); // storing random integers in an array
            System.out.println(arr[i]);
        }
    }

}

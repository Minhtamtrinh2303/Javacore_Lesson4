import java.util.Arrays;
import java.util.Scanner;

public class Hw23 {
    /**
     * Thực hiện nhập vào hai ma trận số nguyên a, b có n dòng và m cột (n, m>0).
     * Thực hiện tính tổng hai ma trận này.
     */
    public static void main(String[] args) {
        int[][] arr = fillArrayA();
        printArrayA(arr);
        int[][] brr = fillArrayB();
        printArrayB(brr);
        System.out.println("The sum of the elements in Array A and Array B: " +((calSumOfArrayA(arr)) + calSumOfArrayB(brr)));
    }

    public static int[][] fillArrayA() {
        System.out.print("row n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("column m = ");
        int m = new Scanner(System.in).nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }

    public static void printArrayA(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

    public static int[][] fillArrayB() {
        System.out.print("row n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("column m = ");
        int m = new Scanner(System.in).nextInt();
        int[][] brr = new int[n][m];
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                brr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return brr;
    }

    public static void printArrayB(int[][] brr) {
        System.out.println(Arrays.deepToString(brr));
    }

    public static int calSumOfArrayA(int[][] arr) {
        int sumA = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumA += arr[i][j];
            }
        }
        return sumA;
    }

    public static int calSumOfArrayB(int[][] brr) {
        int sumB = 0;
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                sumB += brr[i][j];
            }
        }
        return sumB;
    }
    
}

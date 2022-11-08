import java.util.Arrays;
import java.util.Scanner;

public class Hw22 {
    /**
     * Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
     * Tìm giá trị lớn nhất và nhỏ nhất của ma trận này.
     */
    public static void main(String[] args) {
        int[][] arr = fillArrayOfIntegers();
        printArrayOfIntegers(arr);
        getMaxAndMin(arr);
    }

    public static int[][] fillArrayOfIntegers() {
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

    public static void printArrayOfIntegers(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

    public static void getMaxAndMin (int[][] arr) {
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if ( max < arr[i][j] ) {
                    max = arr[i][j];
                }
                if ( min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("The max number in the two-dimensional arrays: " +max);
        System.out.println("The min number in the two-dimensional arrays: " +min);
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class Hw21 {
    /**
     * Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m>0).
     * Tính tổng, trung bình cộng của tất cả các giá trị trong ma trận.
     */
    public static void main(String[] args) {
        int[][] arr = fillArrayOfIntegers();
        printArrayOfIntegers(arr);
        cal(arr);

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

    public static void cal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The sum of the elements: " + sum);
        System.out.println("The mean of the elements: " + sum / (arr.length * arr[0].length));
    }
    
}

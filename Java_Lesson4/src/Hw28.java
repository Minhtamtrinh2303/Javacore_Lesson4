import java.util.Scanner;

public class Hw28 {
    /**
     * Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n>0).
     * Tính tổng đường chéo chính của ma trận này.
     */
    public static void main(String[] args) {
        int[][] arr = fillArrayOfIntegers();
    }

    public static int[][] fillArrayOfIntegers() {
        System.out.print("row n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("column m = ");
        int m = new Scanner(System.in).nextInt();
        //check m, n
        check(m, n);
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                arr[i][j] = new Scanner(System.in).nextInt();
            }
        }
        return arr;
    }

    public static void check(int m, int n) {
        while (true) {
            if (m == n) {
                break;
            }
            System.out.print("row n = ");
            n = new Scanner(System.in).nextInt();
            System.out.print("column m = ");
            m = new Scanner(System.in).nextInt();
        }
    }

    

}

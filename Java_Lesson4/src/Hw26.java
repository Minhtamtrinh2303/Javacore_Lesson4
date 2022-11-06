import java.util.Scanner;

public class Hw26 {
    /**
     * Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một số nguyên x.
     * Đếm số lần xuất hiện của x trong mảng a.
     */
    public static void main(String[] args) {
        int[] arr = fillArrayOfIntegers();
        count_occur(arr);
    }

    public static int[] fillArrayOfIntegers() {
        System.out.print("Enter the number of element(s) = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        for( int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = new Scanner(System.in).nextInt();
        }
        return arr;
    }

    public static void count_occur(int[] arr) {
        System.out.print("Enter x = ");
        int x = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == x ) {
                count++;
            }
        }
        System.out.println("The occurence(s) of number x in the array = " +count);
    }
}

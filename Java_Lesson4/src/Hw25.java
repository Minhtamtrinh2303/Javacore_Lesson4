import java.util.Scanner;

public class Hw25 {
    /**
     * Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
     * Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.
     */
    public static void main(String[] args) {
        int[] arr = fillArrayOfIntegers();
        count_numbers(arr);
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

    public static void count_numbers(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] % 2 == 0 ) {
                even++;
            }
            if ( arr[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.println("The number(s) of even number(s) in the array = " +even);
        System.out.println("The number(s) of odd number(s) in the array = " +odd);
    }

}

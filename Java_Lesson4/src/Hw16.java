import java.util.Scanner;

public class Hw16 {
    /**
     * Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.
     */
    public static void main(String[] args) {
        System.out.print("n = ");  // n>1
        int n = new Scanner(System.in).nextInt(); //Natural Number
        //print even number
        printEven(n);
        System.out.println("");
        //print odd number
        printOdd(n);

    }
    //check even number
    public static boolean evenNumber(int n) {
        if ( n % 2 == 0) {
            return true;
        }
        return false;
    }
    //check odd number
    public static boolean oddNumber(int n) {
        if ( n % 2 == 1) {
            return true;
        }
        return false;
    }
    //print even number
    public static void printEven(int n) {
        System.out.print("Even number (s) less than " + n + " is ( are ): ");
        for (int i = 0; i<n; i++) {
            if (evenNumber(i)) {
                System.out.print(i +" ");
            }
        }
    }
    //print odd number
    public static void printOdd(int n) {
        System.out.print("Odd number (s) less than " + n + " is ( are ): ");
        for (int i = 0; i<n; i++) {
            if (oddNumber(i)) {
                System.out.print(i +" ");
            }
        }
    }

}

import java.util.Scanner;

public class Hw10_ {
    public static void main(String[] args) {
        int[] arr = arr_input();
    }

    public static int[] arr_input() {
        System.out.print("Enter n = ");
        int n = new Scanner(System.in).nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = new Scanner(System.in).nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]){
                    System.out.println("Invalid value");
                    System.out.print("Enter again arr["+i+"] = ");
                    arr[i] = new Scanner(System.in).nextInt();
                    j = 0;
                }
            }
        }
        return arr;
    }
}

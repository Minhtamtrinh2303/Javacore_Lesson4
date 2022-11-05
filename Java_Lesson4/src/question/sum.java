package question;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt(); //Natural Number
        double count = 0;
        for (double i = 1; i <= n; i++) {
            count += 1 / i;
        }
        System.out.println(count);
    }
}
//quên đổi kiểu dữ liệu
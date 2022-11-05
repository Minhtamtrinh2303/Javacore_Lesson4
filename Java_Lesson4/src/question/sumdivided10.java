package question;

public class sumdivided10 {
    public static void main(String[] args) {
        for (int i = 100; i<1000; i++) {
            if (Sum(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean Sum(int n) {
        int sum = 0;
        while ( n > 0 ) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }
}
// có thắc mắc vì sao viết if, return true/false ko chạy được

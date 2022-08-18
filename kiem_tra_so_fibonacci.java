import java.util.Scanner;
import java.util.Arrays;

public class kiem_tra_so_fibonacci {
    public static long[] fibo = new long[93];

    public static void Fibonacci() {
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i < 93; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static void main(String[] args) {
        int t;
        Scanner input = new Scanner(System.in);
        Fibonacci();
        t = input.nextInt();
        while (t > 0) {
            t--;
            long n = input.nextLong();
            if (Arrays.binarySearch(fibo, 0, 93, n) >= 0) {
                System.out.println("YES");
            } else
                System.out.println("NO");

            // System.out.println(fibo[n]);

        }
    }
}

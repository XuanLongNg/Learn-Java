import java.util.Scanner;

public class tinh_so_Fibonacci {
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
            int n = input.nextInt();
            System.out.println(fibo[n]);

        }
    }
}

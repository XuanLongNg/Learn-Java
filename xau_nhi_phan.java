import java.util.Scanner;

public class xau_nhi_phan {
    public static long[] fibo = new long[93];

    public static void Fibonacci() {
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i < 93; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static long xau(int n, long k) {
        // System.out.println(n + " " + k);
        if (n == 3 && k == 2)
            return 1;
        else if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        if (k > fibo[n - 2]) {
            return xau(n - 1, k - fibo[n - 2]);
        } else {
            return xau(n - 2, k);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        Fibonacci();
        while (t-- > 0) {
            int n = input.nextInt(), k = input.nextInt();
            System.out.println(xau(n, k));
        }
    }
}

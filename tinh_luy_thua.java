import java.util.Scanner;

public class tinh_luy_thua {
    public static long MOD = 1000000007;

    public static long Pow(long n, long k) {
        if (k == 0)
            return 1;
        long tmp = Pow(n, k / 2);
        if (k % 2 == 0)
            return (tmp * tmp) % MOD;
        return (tmp * tmp % MOD) * n % MOD;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a, b;
        while (true) {
            a = input.nextLong();
            b = input.nextLong();
            if (a == 0 && b == 0)
                break;
            long ans = Pow(a, b);
            System.out.println(ans);
        }
    }
}

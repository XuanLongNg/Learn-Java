import java.util.*;

public class boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {
    public static long GCD(long a, long b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

    public static long lcm(long a, long b) {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong(), ans = 1;
            for (long i = 1; i <= n; i++) {
                ans = lcm(ans, i);
            }
            System.out.println(ans);
        }
    }
}

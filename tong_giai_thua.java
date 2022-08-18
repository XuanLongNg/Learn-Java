import java.util.Scanner;

public class tong_giai_thua {
    public static long giaithua(long n) {
        if (n < 2)
            return 1;
        long ans = 1;
        for (int i = 1; i <= n; i++)
            ans *= i;
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += giaithua(i);
        }
        System.out.println(ans);
    }
}

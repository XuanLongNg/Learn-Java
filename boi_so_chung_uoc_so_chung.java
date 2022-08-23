import java.util.Scanner;

public class boi_so_chung_uoc_so_chung {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            t--;
            long n = input.nextLong(), m = input.nextLong();
            long Gcd = gcd(n, m), boi;
            boi = (n * m) / Gcd;
            System.out.println(boi + " " + Gcd);
        }
    }
}

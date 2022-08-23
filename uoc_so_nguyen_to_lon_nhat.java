import java.util.Scanner;

public class uoc_so_nguyen_to_lon_nhat {

    public static boolean isPrime(long n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static long findMax(long n) {
        long max = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (isPrime(i))
                    max = Math.max(max, i);
                if (isPrime(n / i))
                    max = Math.max(max, n / i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        long count = 0;
        while (t > 0) {
            t--;
            long n = input.nextLong();
            System.out.println(findMax(n));
        }
    }
}
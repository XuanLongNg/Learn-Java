import java.util.Scanner;

public class so_lien_ke {
    public static boolean check(long n) {
        long tmp = n % 10, next;
        n /= 10;
        while (n > 0) {
            next = n % 10;
            if (Math.abs(next - tmp) != 1)
                return false;
            tmp = next;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong();
            if (check(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

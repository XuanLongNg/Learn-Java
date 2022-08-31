import java.util.*;
import java.math.BigInteger;

public class boi_so_chung_nho_nhat {
    public static BigInteger GCD(BigInteger n, BigInteger k) {
        BigInteger tmp = new BigInteger("0");
        if (k.compareTo(tmp) == 0)
            return n;
        return GCD(k, n.mod(k));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            // String a1 = input.nextLine(), a2 = input.nextLine();
            BigInteger n = new BigInteger(input.nextLine()), k = new BigInteger(input.nextLine());
            System.out.println((n.multiply(k)).divide(GCD(n, k)));

        }
    }
}

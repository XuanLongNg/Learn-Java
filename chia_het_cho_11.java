import java.util.*;
import java.math.*;

public class chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            BigInteger n = new BigInteger(input.nextLine());
            if (n.mod(BigInteger.valueOf(11)).equals(BigInteger.valueOf(0)))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}

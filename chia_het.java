import java.util.*;
import java.math.BigInteger;

public class chia_het {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String temp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            String[] tmp = n.split(" ");
            BigInteger a = new BigInteger(tmp[0]), b = new BigInteger(tmp[1]), c = new BigInteger("0");
            if (a.mod(b).compareTo(c) == 0 || b.mod(a).compareTo(c) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

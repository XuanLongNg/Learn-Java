import java.util.*;
import java.math.*;

public class tim_so_du {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            BigInteger n = new BigInteger(input.nextLine()),
                    b0 = new BigInteger("0"),
                    b1 = new BigInteger("1"),
                    b2 = new BigInteger("2"),
                    b3 = new BigInteger("3"),
                    b4 = new BigInteger("4"),
                    b5 = new BigInteger("5"),
                    b6 = new BigInteger("6"),
                    b7 = new BigInteger("7"),
                    b8 = new BigInteger("8"),
                    b9 = new BigInteger("9"),
                    para2 = n.mod(b4),
                    para3 = n.mod(b4),
                    para4 = n.mod(b2),
                    ans;
            if (para2.equals(b1))
                para2 = b2;
            else if (para2.equals(b2))
                para2 = b4;
            else if (para2.equals(b3))
                para2 = b8;
            else
                para2 = b6;
            if (para3.equals(b1))
                para3 = b3;
            else if (para3.equals(b2))
                para3 = b9;
            else if (para3.equals(b3))
                para3 = b7;
            else
                para3 = b1;
            if (para4.equals(b1))
                para4 = b4;
            else
                para4 = b6;
            // System.out.println(para2 + " " + para3 + " " + para4);
            ans = para2.add(para3).add(para4).add(b1);
            ans = ans.mod(new BigInteger("5"));
            System.out.println(ans);
        }
    }
}
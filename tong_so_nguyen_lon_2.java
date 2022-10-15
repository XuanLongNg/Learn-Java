import java.util.*;
import java.math.BigInteger;

public class tong_so_nguyen_lon_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next(), a0 = input.next();
        BigInteger n = new BigInteger(a), k = new BigInteger(a0),
                temp = n.add(k);
        // String ans = temp.toString(10), a1 = n.toString(10), a2 = k.toString(10);
        // int i = ans.length(), Max = Math.max(a1.length(), a2.length());
        // while (i < Max) {
        // i++;
        // ans = "0" + ans;
        // }
        System.out.println(temp);
    }
}
import java.util.*;
import java.math.BigInteger;

public class hieu_so_nguyen_lon_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next(), a0 = input.next();
        BigInteger n = new BigInteger(a), k = new BigInteger(a0),
                temp = n.subtract(k);
        System.out.println(temp);

    }
}

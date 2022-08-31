import java.util.*;

public class xau_khac_nhau_dai_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine(), k = input.nextLine();
            if (n.equals(k))
                System.out.println("-1");
            else
                System.out.println(Math.max(n.length(), k.length()));
        }
    }
}

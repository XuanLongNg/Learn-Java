import java.util.*;

public class dien_thoai_cuc_gach {
    public static boolean Try(String n) {
        for (int i = 0; i < n.length() / 2; i++) {
            if (n.charAt(i) != n.charAt(n.length() - i - 1))
                return false;
        }
        return true;
    }

    public static String check(String c) {
        if ("ABCabc".contains(c))
            return "2";
        else if ("DEFdef".contains(c))
            return "3";
        else if ("GHIghi".contains(c))
            return "4";
        else if ("JKLjkl".contains(c))
            return "5";
        else if ("MNOmno".contains(c))
            return "6";
        else if ("PQRSpqrs".contains(c))
            return "7";
        else if ("TUVtuv".contains(c))
            return "8";
        else if ("WXYZwxyz".contains(c))
            return "9";
        return "0";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine(), ans = "";
            for (int i = 0; i < n.length(); i++) {
                ans += check(String.valueOf(n.charAt(i)));
            }
            if (Try(ans))
                System.out.println(("YES"));
            else
                System.out.println("NO");
        }
    }
}

import java.util.*;

public class chuan_hoa_xau_ho_ten_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            n = n.toLowerCase();
            n = n.trim();
            String[] ans = n.split("[, ?.@]+");
            for (String a : ans) {
                char[] rep = Character.toChars((int) a.charAt(0) - 32);
                // System.out.println(rep);
                StringBuilder temp = new StringBuilder(a);
                temp.setCharAt(0, rep[0]);
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}

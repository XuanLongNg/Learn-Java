import java.util.*;

public class tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine(), k = input.nextLine();
            String[] arr = n.split("[, ?.@]+");
            Set<String> ans = new TreeSet<String>();
            for (String a : arr) {
                if (k.contains(a) == false) {
                    ans.add(a);
                }
            }
            for (String a : ans)
                System.out.print(a + " ");
            System.out.println();
        }
    }
}
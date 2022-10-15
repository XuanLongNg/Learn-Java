import java.util.*;

public class loai_bo_100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            int first = n.length();
            while (n.contains("100")) {
                n = n.substring(0, n.indexOf("100")) + n.substring(n.indexOf("100") + 3);
                // System.out.println(n);
            }
            System.out.println(first - n.length());
        }
    }
}
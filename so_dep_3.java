import java.util.*;

public class so_dep_3 {
    public static boolean sont(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7;
    }

    public static boolean Try(String n) {
        for (int i = 0; i < n.length() / 2; i++) {
            // System.out.println(((int) n.charAt(i) - 48) % 2);
            if (sont((int) n.charAt(i) - 48) == false || n.charAt(i) != n.charAt(n.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            if (Try(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

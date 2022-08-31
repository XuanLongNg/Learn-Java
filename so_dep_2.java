import java.util.*;

public class so_dep_2 {
    public static boolean Try(String n) {
        if (n.charAt(0) != '8' || n.charAt(n.length() - 1) != '8')
            return false;
        int total = 0;
        for (int i = 0; i < n.length() / 2; i++) {
            // System.out.println(((int) n.charAt(i) - 48) % 2);
            total += (int) n.charAt(i) - 48;
        }
        return total % 10 == 0;
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

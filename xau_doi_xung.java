import java.util.*;

public class xau_doi_xung {
    public static boolean check(String n) {
        int dem = 0;
        for (int i = 0; i < n.length() / 2; i++) {
            if (n.charAt(i) != n.charAt(n.length() - i - 1))
                dem++;
        }
        if (n.length() % 2 == 1 && dem <= 1)
            return true;
        else if (n.length() % 2 == 0 && dem == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            if (check(n) == false)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}

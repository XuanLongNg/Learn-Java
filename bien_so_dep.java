import java.util.*;

public class bien_so_dep {
    public static boolean check(String n) {
        boolean result = true;
        for (int i = 1; i < n.length(); i++) {
            if ((int) n.charAt(i) <= (int) n.charAt(i - 1)) {
                result = false;
                break;
            }
        }
        if (result)
            return true;
        result = true;
        for (int i = 1; i < n.length(); i++) {
            if ((int) n.charAt(i) != (int) n.charAt(i - 1)) {
                result = false;
                break;
            }
        }
        if (result)
            return true;
        result = true;
        for (int i = 0; i < n.length(); i++) {
            if ((int) n.charAt(i) - 48 != 6 && (int) n.charAt(i) - 48 != 8) {
                result = false;
                break;
            }
        }
        if (result)
            return true;
        result = true;
        if (n.charAt(0) == n.charAt(1) && n.charAt(1) == n.charAt(2) && n.charAt(3) == n.charAt(4))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine(), k;
            String[] temp = n.split("[-, ?.@]+"), temp1;
            k = temp[1] + temp[2];
            // temp1 = temp[1].split(".");
            // for (String i : temp1) {
            // System.out.println(i);
            // }
            if (check(k))
                System.out.println("YES");
            else
                System.out.println("NO");
            // System.out.println(k);
        }
    }
}

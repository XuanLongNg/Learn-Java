import java.util.*;

public class so_uu_the {
    public static int check(String n) {
        int demchan = 0, demle = 0, dem = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
                dem++;
                if (((int) n.charAt(i) - 48) % 2 == 0)
                    demchan++;
                else
                    demle++;
            } else
                return -1;
        }
        if (demchan > demle && dem % 2 == 0)
            return 1;
        else if (demchan < demle && dem % 2 == 1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            if (check(n) == 0)
                System.out.println("NO");
            else if (check(n) == 1)
                System.out.println("YES");
            else
                System.out.println("INVALID");
        }
    }
}

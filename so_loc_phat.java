import java.util.*;

public class so_loc_phat {
    public static ArrayList<Long> ans = new ArrayList<Long>();

    public static void Try(int i, int n, long tmp) {
        if (i == n) {
            ans.add(tmp);
            return;
        }
        for (int j = 6; j < 9; j += 2) {
            Try(i + 1, n, tmp * 10 + j);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            ans.clear();
            int n = input.nextInt();
            n++;
            while (n-- > 1)
                Try(0, n, 0);
            System.out.println(ans.size());
            Collections.sort(ans);
            Collections.reverse(ans);
            for (Long i : ans)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}

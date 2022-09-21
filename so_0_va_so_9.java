import java.util.*;

public class so_0_va_so_9 {
    public static boolean check;

    public static void Try(int i, int k, int n, long ans) {
        if (check == true || i == n)
            return;
        if (ans != 0 && ans % k == 0) {
            System.out.println(ans);
            check = true;
            return;
        }
        for (int j = 0; j < 10; j += 9) {
            if (i > 0 || i == 0 && j == 9) {
                Try(i + 1, k, n, ans * 10 + j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            check = false;
            int i = 1;
            while (check == false) {
                Try(0, n, i, 0);
                i++;
            }
        }
    }
}

import java.util.*;

public class uoc_so_chung_lop_nhat {
    public static int gcd(int x, int y) {
        int a = x, b = y, c = x;
        while (b > 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static int lcm(int x, int y) {
        return (x * y) / gcd(x, y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        // String tmp = input.nextLine();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = input.nextInt();
            int[] ans = new int[n + 1];
            ans[0] = arr[0];
            ans[n] = arr[n - 1];
            for (int i = 1; i < n; i++)
                ans[i] = lcm(arr[i - 1], arr[i]);
            for (int i = 0; i < n + 1; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
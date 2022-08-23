import java.util.*;

public class liet_ke_to_hop_2 {
    public static int count = 0;

    public static void Print(ArrayList<Integer> ans) {
        for (Integer i : ans) {
            System.out.print(i);
        }
        System.out.print(" ");
    }

    public static void Try(int i, int tmp, int n, int k, ArrayList<Integer> ans) {
        if (i == k) {
            Print(ans);
            count++;
            return;
        }
        for (int j = tmp; j < n - k + i + 1; j++) {
            ans.set(i, j + 1);
            Try(i + 1, j + 1, n, k, ans);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < k; i++)
            ans.add(0);
        Try(0, 0, n, k, ans);
        System.out.printf("\nTong cong co %d to hop\n", count);
    }
}

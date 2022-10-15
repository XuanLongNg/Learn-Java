import java.util.*;

public class day_con_lien_tiep_tong_bang_k {
    public static boolean Check(int[] arr, int n, long k) {
        long total = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            // System.out.println(total);
            q.add(arr[i]);
            total += arr[i];
            while (total > k) {
                total -= q.remove();
            }
            if (q.size() != 0 && total == k)
                return true;
        }
        while (total > k) {
            total -= q.remove();
            // System.out.println(total);
        }
        return q.size() != 0 && total == k;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long k = input.nextLong();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = input.nextInt();
            if (Check(arr, n, k))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
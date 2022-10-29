import java.util.*;

public class bien_doi_s_t {
    public static int Min;

    public static void Try(int total, int key, int count, int limit) {
        // System.out.print(total + " ");
        if (count > Min)
            return;
        // if (total >= limit)
        // return;
        if (total == key) {
            Min = Math.min(count, Min);
            return;
        }
        if (key < total)
            Try(total, total, count + total - key, limit);
        else if (key >= total) {
            if (key % 2 == 1)
                Try(total, key + 1, count + 1, limit);
            else {
                if (key >= total)
                    Try(total, key / 2, count + 1, limit);
                else
                    Try(total, key + 1, count + 1, limit);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int s = input.nextInt(), n = input.nextInt();
            Min = 100000000;
            int tmp = Math.max(s * 2 + 1, t * 2 + 1);
            Try(s, n, 0, tmp);
            System.out.println(Min);
        }
    }
}
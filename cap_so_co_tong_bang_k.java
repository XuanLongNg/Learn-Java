import java.util.*;

public class cap_so_co_tong_bang_k {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long n = input.nextLong(), k = input.nextLong();
            Map<Long, Long> arr = new TreeMap<Long, Long>();
            for (int i = 0; i < n; i++) {
                long h = input.nextLong();
                if (arr.containsKey(h))
                    arr.put(h, arr.get(h) + 1);
                else
                    arr.put(h, Long.valueOf(1));
            }
            long ans = 0;
            for (Long i : arr.keySet()) {
                if (arr.containsKey(k - i) && arr.get(k - i) > 0 && arr.get(i) > 0) {
                    if (k - i == i)
                        ans += arr.get(i) * (arr.get(i) - 1) / 2;
                    else
                        ans += arr.get(k - i) * arr.get(i);
                    arr.put(k - i, Long.valueOf(0));
                    arr.put(i, Long.valueOf(0));
                }
            }
            System.out.println(ans);
        }

    }
}

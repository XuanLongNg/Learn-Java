import java.util.*;

public class day_con_co_k_phan_tu_tang_dan {
    public static ArrayList<String> fans = new ArrayList<String>();

    public static void Try(int i, int j, int n, int k, Integer[] arr, String ans) {
        if (i == k) {
            fans.add(ans);
            return;
        }
        for (int h = j; h < n; h++) {
            Try(i + 1, h + 1, n, k, arr, ans + String.valueOf(arr[h] + " "));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt(), k = input.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++)
                arr[i] = input.nextInt();
            Arrays.sort(arr);
            Try(0, 0, n, k, arr, "");
            Collections.sort(fans, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    String[] tmp1 = s1.split(" "), tmp2 = s2.split(" ");
                    int k = Math.min(tmp1.length, tmp2.length);
                    for (int i = 0; i < k; i++)
                        if (tmp1[i].equals(tmp2[i]) == false)
                            return Integer.valueOf(tmp1[i]) - Integer.valueOf(tmp2[i]);
                    return tmp1.length - tmp2.length;
                }
            });
            for (String i : fans)
                System.out.println(i);
            fans.clear();
        }
    }
}

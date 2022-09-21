import java.util.*;

public class day_con_tong_le {
    public static ArrayList<String> fans = new ArrayList<String>();

    public static void Try(int i, int j, int n, Integer[] arr, String ans, int total) {
        if (total % 2 != 0) {
            // System.out.println(ans);
            fans.add(ans);
            // return;
        }
        if (i == n)
            return;
        for (int k = j; k < n; k++) {
            Try(i + 1, k + 1, n, arr, ans + String.valueOf(arr[k] + " "), total + arr[k]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++)
                arr[i] = input.nextInt();
            Arrays.sort(arr, Collections.reverseOrder());
            Try(0, 0, n, arr, "", 0);
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

import java.util.*;

public class day_con_co_tong_nguyen_to {
    public static ArrayList<String> fans = new ArrayList<String>();
    public static boolean[] check = new boolean[2000];

    public static void Eratosthenes() {
        check[0] = true;
        check[1] = true;
        for (int i = 2; i < (int) Math.sqrt(2000); i++)
            if (check[i] == false)
                for (int j = i * i; j < 2000; j += i)
                    check[j] = true;
    }

    public static void Try(int i, int j, int n, Integer[] arr, String ans, int total) {
        if (check[total] == false) {
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
            Eratosthenes();
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

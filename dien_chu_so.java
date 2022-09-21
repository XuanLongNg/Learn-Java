import java.util.*;

public class dien_chu_so {
    public static long count;

    public static void Try(int i, int n, String a, long k, ArrayList<Integer> index) {
        if (i == n) {
            if (Long.valueOf(a) > k)
                count++;
            return;
        }
        int tmp = index.get(i);
        for (int j = 0; j < 10; j++) {
            String temp = a.substring(0, tmp) + String.valueOf(j) + a.substring(tmp + 1);
            Try(i + 1, n, temp, k, index);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String saaa = sc.nextLine();
        while (t-- > 0) {
            String a = sc.nextLine(), b = sc.nextLine();
            long c = 0, d = Long.valueOf(b);
            count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != '?' && Integer.valueOf(a.charAt(i)) < Integer.valueOf(b.charAt(i))) {
                    c = 1;
                    break;
                } else if (a.charAt(i) != '?')
                    break;
            }
            if (c == 0) {
                ArrayList<Integer> position = new ArrayList<Integer>();
                for (int i = 0; i < a.length(); i++)
                    if (a.charAt(i) == '?')
                        position.add(i);
                Try(0, position.size(), a, d, position);
            }
            System.out.println(count);
        }
    }
}

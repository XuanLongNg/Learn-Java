import java.util.*;

public class luu_chon_tham_lam {
    public static String somin(int m, int s) {
        if (s > 9 * m || (m > 1 && s == 0))
            return "-1";
        s -= 1;
        int[] v = new int[m];
        String n = "";
        for (int i = m - 1; i > 0; i--) {
            if (s > 9) {
                v[i] = 9;
                s -= 9;
            } else {
                v[i] = s;
                s = 0;
            }
        }
        v[0] = s + 1;
        for (int i = 0; i < m; i++) {
            n += String.valueOf(v[i]);
        }
        return n;
    }

    public static String somax(int m, int s) {
        if (s > 9 * m || (m > 1 && s == 0))
            return "-1";
        int[] v = new int[m];
        String n = "";
        for (int i = 0; i < m; i++) {
            if (s > 9) {
                v[i] = 9;
                s -= 9;
            } else {
                v[i] = s;
                s = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            n += String.valueOf(v[i]);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        System.out.println(somin(a, b) + " " + somax(a, b));
    }
}

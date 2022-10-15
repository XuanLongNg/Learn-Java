import java.util.*;

public class ma_hoa_drm {
    public static int find(char k) {
        return (int) (k) - (int) ('A');
    }

    public static char convert(char c, int k) {
        int tmp = find(c) + k;
        tmp %= 26;
        tmp += (int) 'A';
        return (char) (tmp);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String line = input.nextLine();
            String a = line.substring(0, line.length() / 2), b = line.substring(line.length() / 2);
            int temp = 0, temp1 = 0;
            for (int i = 0; i < a.length(); i++) {
                temp += find(a.charAt(i));
                temp1 += find(b.charAt(i));
            }
            // System.out.println(temp + " " + temp1);
            String a1 = "", b1 = "";
            for (int i = 0; i < a.length(); i++) {
                a1 += convert(a.charAt(i), temp);
                b1 += convert(b.charAt(i), temp1);
            }
            // System.out.println(a1 + " " + b1);
            String ans = "";
            for (int i = 0; i < a.length(); i++) {
                ans += convert(a1.charAt(i), find(b1.charAt(i)));
            }
            System.out.println(ans);
        }
    }
}

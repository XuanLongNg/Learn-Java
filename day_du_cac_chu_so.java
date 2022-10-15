import java.util.*;

public class day_du_cac_chu_so {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int k = input.nextInt();
            if (k == 0) {
                System.out.println("Impossible");
                continue;
            }
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            int i = 1;
            while (i <= 100) {
                long temp = k * i;
                String check = String.valueOf(temp);
                for (int j = 0; j < check.length(); j++) {
                    map.put(check.charAt(j), 1);
                }
                if (map.size() == 10)
                    break;
                i++;
            }
            if (map.size() == 10)
                System.out.println(k * i);
            else
                System.out.println("Impossible");

        }
    }
}

import java.util.*;

public class xau_day_du {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String line = input.nextLine();
            int k = Integer.parseInt(input.nextLine());
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            for (int i = 0; i < line.length(); i++)
                map.put(line.charAt(i), 1);
            if (map.size() + k >= 26)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

import java.util.*;

public class so_la_ma {
    public static int find(char k) {
        if (k == 'I')
            return 1;
        else if (k == 'V')
            return 5;
        else if (k == 'X')
            return 10;
        else if (k == 'L')
            return 50;
        else if (k == 'C')
            return 100;
        else if (k == 'D')
            return 500;
        else
            return 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String line = input.nextLine();
            int total = 0;
            for (int i = 0; i < line.length() - 1; i++) {
                int temp = find(line.charAt(i));
                // System.out.print(temp + " ");
                if (temp < find(line.charAt(i + 1)))
                    total -= temp;
                else
                    total += temp;
            }
            total += find(line.charAt(line.length() - 1));
            System.out.println(total);
        }
    }
}

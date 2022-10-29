import java.util.*;

public class dao_dau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            a.add(input.nextInt());
        Collections.sort(a);
        for (int j = 0; j < n && k > 0; j++) {
            if (a.get(j) < 0) {
                a.set(j, -a.get(j));
                k--;
            } else
                break;

        }
        Collections.sort(a);
        if (k % 2 == 1)
            a.set(0, -a.get(0));
        long total = 0;
        for (int i = 0; i < n; i++)
            total += a.get(i);
        System.out.println(total);
    }
}

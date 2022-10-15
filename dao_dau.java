import java.util.*;

public class dao_dau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            a.add(input.nextInt());
        Collections.sort(a);
        for (int i = 0; i < k; i++)
            a.set(i, -a.get(i));
        long total = 0;
        for (int i = 0; i < n; i++)
            total += a.get(i);
        System.out.println(total);
    }
}

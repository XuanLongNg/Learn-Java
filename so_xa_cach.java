import java.util.*;

public class so_xa_cach {
    public static void Try(int i, int n, ArrayList<Integer> list, boolean[] check) {
        if (i == n) {
            for (Integer j : list) {
                System.out.print(j);
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < n; j++) {
            if (check[j] == false) {
                if (i > 0 && Math.abs(j + 1 - list.get(i - 1)) == 1)
                    continue;
                check[j] = true;
                list.set(i, j + 1);
                Try(i + 1, n, list, check);
                check[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            boolean[] check = new boolean[n];
            for (int i = 0; i < n; i++) {
                list.add(0);
                check[i] = false;
            }
            Try(0, n, list, check);
        }
    }
}

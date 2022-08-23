import java.util.*;

public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(), count = 1;
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.println("Test " + count + ":");
            count++;
            HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();
            int[] arrtmp = new int[n];
            for (int i = 0; i < n; i++) {
                int tmp = input.nextInt();
                arrtmp[i] = tmp;
                if (arr.containsKey(tmp)) {
                    arr.put(tmp, arr.get(tmp) + 1);
                } else
                    arr.put(tmp, 1);
            }
            for (int i = 0; i < n; i++) {
                if (arr.containsKey(arrtmp[i])) {
                    System.out.print(arrtmp[i] + " xuat hien " + arr.get(arrtmp[i]) + " lan\n");
                    arr.remove(arrtmp[i]);
                }
            }

        }
    }
}

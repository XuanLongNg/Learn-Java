import java.util.*;

public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dem = sc.nextInt(), count = 1;
        while (count <= dem) {
            System.out.println("Test " + count + ":");
            int n = sc.nextInt();
            count++;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                arr[i] = tmp;
                if (map.containsKey(tmp))
                    map.put(tmp, map.get(tmp) + 1);
                else
                    map.put(tmp, 1);
            }
            for (int i = 0; i < n; i++) {
                if (map.containsKey(arr[i])) {
                    System.out.print(arr[i] + " xuat hien " + map.get(arr[i]) + " lan\n");
                    map.remove(arr[i]);
                }
            }

        }
    }
}

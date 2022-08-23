import java.util.*;

public class giao_cua_hai_day_so {
    // public static int[] giao()
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int[] arr = new int[n], arr0 = new int[m];
        Set<Integer> arr1 = new TreeSet<Integer>(), arr2 = new TreeSet<Integer>();
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        for (int i = 0; i < m; i++)
            arr0[i] = input.nextInt();
        for (int i = 0; i < n; i++)
            arr1.add(arr[i]);
        for (int i = 0; i < m; i++)
            arr2.add(arr0[i]);
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        for (Integer i : arr1) {
            if (arr2.contains(i)) {
                System.out.print(i + " ");
            }
        }
        // System.out.println("");
        // arr2[i] = input.nextInt();

    }
}

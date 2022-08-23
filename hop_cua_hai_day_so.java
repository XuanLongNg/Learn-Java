import java.util.*;

public class hop_cua_hai_day_so {
    // public static int[] giao()
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int[] arr = new int[n], arr0 = new int[m];
        Set<Integer> arr1 = new TreeSet<Integer>(), arr2 = new TreeSet<Integer>();
        for (int i = 0; i < n + m; i++)
            arr1.add(input.nextInt());
        // Arrays.
        for (Integer i : arr1) {
            System.out.print(i + " ");
        }
    }
}

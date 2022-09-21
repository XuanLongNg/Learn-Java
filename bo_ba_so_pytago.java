import java.util.*;

public class bo_ba_so_pytago {
    public static boolean BinarySearch(int[] arr, int l, int r, int key) {
        int mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (arr[mid] >= key)
                r = mid;
            else
                l = mid + 1;
        }
        return arr[l] == key;
    }

    public static boolean checkPytago(int[] arr, int n) {
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                double c = Math.sqrt(Math.pow(arr[i], 2) + Math.pow(arr[j], 2));
                if ((int) c != c)
                    continue;
                if (BinarySearch(arr, j + 1, n - 1, (int) c))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = input.nextInt();
            Arrays.sort(arr);
            if (checkPytago(arr, n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

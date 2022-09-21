import java.util.*;

public class khoang_cach_nho_hon_k {
    public static int BinarySearch(int[] arr, int l, int r, int key) {
        int mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (arr[mid] >= key)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt(), k = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = input.nextInt();
            Arrays.sort(arr);
            long count = 0;
            for (int i = 0; i < n - 1; i++) {
                int head = BinarySearch(arr, i + 1, n - 1, arr[i] + k);
                while (head >= i + 1 && Math.abs(arr[head] - arr[i]) >= k)
                    head--;
                count += head - i;
                // System.out.print(arr[head] + " " + arr[i] + " ");
            }
            System.out.println(count);

        }
    }
}

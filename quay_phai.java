import java.util.*;

public class quay_phai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            long[] arr = new long[n];
            long minValue = Long.MAX_VALUE, minIndex = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextLong();
                if (arr[i] < minValue) {
                    minValue = arr[i];
                    minIndex = i;
                }
            }
            System.out.println(minIndex);
        }
    }
}

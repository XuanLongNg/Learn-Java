import java.util.*;

public class hinh_sao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n - 1; i++) {
            int a = input.nextInt(), b = input.nextInt();
            arr[a]++;
            arr[b]++;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == n - 1) {
                // System.out.println(i + " " + arr[i]);
                count++;
            }
        }
        if (count == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

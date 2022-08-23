import java.util.*;

public class diem_can_bang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt(), total = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                total += arr[i];
            }
            int tmp = arr[0], check = 0, temp = total - arr[0];
            for (int i = 1; i < n; i++) {
                temp -= arr[i];
                // System.out.println(tmp + " " + temp);
                if (tmp == temp) {
                    System.out.println(i + 1);
                    check = 1;
                    break;
                }
                tmp += arr[i];
            }
            if (check == 1)
                continue;
            System.out.println("-1");
        }

    }
}

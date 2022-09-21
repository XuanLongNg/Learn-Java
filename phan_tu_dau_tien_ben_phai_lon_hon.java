import java.util.*;

public class phan_tu_dau_tien_ben_phai_lon_hon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = input.nextInt();
            for (int i = 0; i < n - 1; i++) {
                boolean check = false;
                for (int j = i + 1; j < n; j++)
                    if (arr[j] > arr[i]) {
                        System.out.print(arr[j] + " ");
                        check = true;
                        break;
                    }
                if (check == false)
                    System.out.print("-1 ");
            }
            System.out.println("-1");
        }
    }
}

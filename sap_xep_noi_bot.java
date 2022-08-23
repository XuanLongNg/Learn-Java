import java.util.*;

public class sap_xep_noi_bot {
    public static void sort(int[] arr, int n) {
        for (int i = n - 1; i > 0; i--) {
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    check = true;
                }
            }
            if (check == false)
                continue;
            System.out.printf("Buoc %d: ", n - i);
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();
        sort(arr, n);
    }
}

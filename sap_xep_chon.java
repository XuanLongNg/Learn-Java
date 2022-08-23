import java.util.*;

public class sap_xep_chon {
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[index] > arr[j])
                    index = j;
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
            System.out.printf("Buoc %d: ", i + 1);
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

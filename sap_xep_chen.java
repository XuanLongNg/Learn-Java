import java.util.*;

public class sap_xep_chen {
    public static void sort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int index = i, value = arr[i];
            while (index > 0 && value < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = value;
            System.out.printf("Buoc %d: ", i);
            for (int j = 0; j < i + 1; j++) {
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

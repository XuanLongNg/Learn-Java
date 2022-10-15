import java.util.*;

public class ma_tran_xoan_oc {
    public static int[][] xoan_oc(int[] arr, int[][] matrix, int n) {
        int tl = 1, tr = n - 1, dl = 0, dr = n - 1;
        int indexi = 0, indexj = 0, i = 0;
        while (true) {
            if (i >= n * n)
                break;
            while (indexj <= tr) {
                if (i >= n * n)
                    break;
                matrix[indexi][indexj++] = arr[i++];
            }
            indexj--;
            indexi++;
            tr--;
            while (indexi <= dr) {
                if (i >= n * n)
                    break;
                matrix[indexi++][indexj] = arr[i++];
            }
            indexi--;
            indexj--;
            dr--;
            while (indexj >= dl) {
                if (i >= n * n)
                    break;
                matrix[indexi][indexj--] = arr[i++];
            }
            indexj++;
            indexi--;
            dl++;
            while (indexi >= tl) {
                if (i >= n * n)
                    break;
                matrix[indexi--][indexj] = arr[i++];
            }
            indexi++;
            indexj++;
            tl++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), count = 0;
        int[][] matrix = new int[n][n];
        int[] arr = new int[n * n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[count++] = input.nextInt();
        Arrays.sort(arr);
        // for (int i = 0; i < n * n; i++)
        // System.out.print(arr[i] + " ");
        matrix = xoan_oc(arr, matrix, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

    }
}

import java.util.*;

public class tich_ma_tran_voi_chuyen_vi_cua_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int count = 1;
        while (t-- > 0) {
            System.out.println("Test " + count + ":");
            count++;
            int n = input.nextInt(), m = input.nextInt();
            int[][] matrix = new int[n][m], ans = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int tmp = 0;
                    for (int k = 0; k < m; k++) {
                        tmp += matrix[i][k] * matrix[j][k];
                    }
                    ans[i][j] = tmp;
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
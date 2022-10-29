import java.util.*;
import java.io.*;

public class sap_xep_ma_tran {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(new File("MATRIX.in"));
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt(), m = input.nextInt(), k = input.nextInt();
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>(), conv = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int j = 0; j < m; j++)
                    tmp.add(input.nextInt());
                arr.add(tmp);
            }
            for (int i = 0; i < m; i++) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int j = 0; j < n; j++)
                    tmp.add(arr.get(j).get(i));
                conv.add(tmp);
            }
            ArrayList<Integer> tmp = conv.get(k - 1);
            Collections.sort(tmp);
            conv.set(k - 1, tmp);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(conv.get(j).get(i) + " ");
                System.out.println();
            }

        }
    }
}
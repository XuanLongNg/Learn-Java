import java.util.*;

public class in_ma_tran {
    public static void Print(ArrayList<Integer> ans) {
        for (Integer i : ans) {
            System.out.print(i + " ");
        }
        // System.out.print(" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                for (int j = 0; j < n; j++)
                    tmp.add(input.nextInt());
                arr.add(tmp);
            }
            for (int i = 0; i < n; i++) {
                if (i % 2 == 1)
                    Collections.reverse(arr.get(i));
                Print(arr.get(i));
            }
            System.out.println();
        }
    }
}

import java.util.*;

public class bo_sung_day_so {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<Integer> arr = new TreeSet<Integer>();
        for (int i = 0; i < n; i++)
            arr.add(input.nextInt());
        int Max = 0;
        for (Integer i : arr) {
            Max = Math.max(Max, i);
        }
        if (Max == arr.size()) {
            System.out.println("Excellent!");
        } else {
            for (int i = 1; i <= Max; i++) {
                if (arr.contains(i) == false)
                    System.out.println(i);
            }
        }
    }
}

import java.util.*;

public class thu_gon_day_so {
    public static ArrayList<Integer> thu_gon(ArrayList<Integer> arr, int n) {
        int i = 1;
        while (i < n) {
            boolean check = false;
            if ((arr.get(i) + arr.get(i - 1)) % 2 == 0) {
                arr.remove(i - 1);
                arr.remove(i - 1);
                n -= 2;
                if (i > 1)
                    i--;
            } else
                i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            arr.add(input.nextInt());
        }
        arr = thu_gon(arr, n);
        System.out.println(arr.size());
    }
}

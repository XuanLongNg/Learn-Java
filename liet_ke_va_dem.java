import java.util.*;

public class liet_ke_va_dem {
    public static boolean check(int n) {
        int tmp = n, pre = tmp % 10, next;
        tmp /= 10;
        while (tmp > 0) {
            next = tmp % 10;
            if (pre < next)
                return false;
            pre = next;
            tmp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> arr = new HashMap<Integer, Integer>();
        int Max = 0;
        while (input.hasNext()) {
            String[] tmp = input.nextLine().split(" ");
            for (String i : tmp) {
                int index = Integer.valueOf(i);
                if (check(index)) {
                    if (arr.containsKey(index))
                        arr.put(index, arr.get(index) + 1);
                    else
                        arr.put(index, 1);
                    Max = Math.max(Max, i.length());
                }
            }
        }
        arr.keySet().iterator().nextstream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        for (Integer i : arr.keySet()) {
            System.out.println(i + " " + arr.get(i));
        }

    }
}

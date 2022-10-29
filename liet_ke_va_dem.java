import java.util.*;

class Pair {
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class liet_ke_va_dem {
    public static boolean isInteger(String s) {
        try {
            int x = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

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
        ArrayList<Pair> arr = new ArrayList<>();
        int Max = 0;
        while (input.hasNext()) {
            String[] tmp = input.nextLine().split(" ");
            for (String i : tmp) {
                if (!isInteger(i))
                    continue;
                int index = Integer.valueOf(i);
                if (check(index)) {
                    boolean found = false;
                    for (int j = 0; j < arr.size(); j++) {
                        if (arr.get(j).x == index) {
                            arr.set(j, new Pair(arr.get(j).x, arr.get(j).y + 1));
                            found = true;
                        }
                    }
                    if (!found)
                        arr.add(new Pair(index, 1));
                }
            }
        }
        Collections.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.y - o1.y;
            }
        });
        for (Pair i : arr) {
            System.out.println(i.x + " " + i.y);
        }

    }
}

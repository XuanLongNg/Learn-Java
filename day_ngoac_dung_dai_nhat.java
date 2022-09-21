import java.util.*;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void Set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair<" + key + ", " + value + ">";
    }
}

public class day_ngoac_dung_dai_nhat {
    public static int check(String s) {
        Stack<Pair<String, Integer>> stk = new Stack<>();
        Vector<Integer> dp = new Vector<Integer>();
        for (int i = 0; i < s.length(); i++)
            dp.add(0);
        int count = 0, Max = 0;
        for (int j = 0; j < s.length(); j++) {
            if (stk.empty() == false && s.charAt(j) == ')' && stk.peek().getKey().equals("(")) {
                dp.set(j, 2);
                if (dp.get(j - 1) > 0)
                    dp.set(j, dp.get(j) + dp.get(j - 1));
                if (stk.peek().getValue() > 0)
                    dp.set(j, dp.get(j) + dp.get(stk.peek().getValue() - 1));
                Max = Math.max(Max, dp.get(j));
                stk.pop();
            } else {
                Pair<String, Integer> k = new Pair<String, Integer>(String.valueOf(s.charAt(j)), j);
                stk.push(k);
            }
        }
        Max = Math.max(Max, count);
        return Max;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            System.out.println(check(n));
        }
    }
}

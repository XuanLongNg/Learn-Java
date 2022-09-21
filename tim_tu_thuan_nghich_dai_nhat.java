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
        return key + " " + value;
    }
}

public class tim_tu_thuan_nghich_dai_nhat {
    public static boolean check(String n) {
        for (int i = 0; i < n.length() / 2; i++) {
            if (n.charAt(i) != n.charAt(n.length() - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pair<String, Integer>> arr = new ArrayList<Pair<String, Integer>>();
        int Max = 0;
        while (input.hasNext()) {
            String[] tmp = input.nextLine().split(" ");
            for (String i : tmp) {
                if (check(i)) {
                    boolean notFound = true;
                    for (int j = 0; j < arr.size(); j++) {
                        if (arr.get(j).getKey().equals(i)) {
                            arr.set(j, new Pair<String, Integer>(arr.get(j).getKey(), arr.get(j).getValue() + 1));
                            notFound = false;
                            break;
                        }
                    }
                    if (notFound)
                        arr.add(new Pair<String, Integer>(i, 1));
                    Max = Math.max(Max, i.length());
                }
            }
        }
        for (Pair<String, Integer> i : arr) {
            if (i.getKey().length() == Max)
                System.out.println(i);
        }

    }
}

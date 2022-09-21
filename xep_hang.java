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

public class xep_hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Pair<Integer, Integer>> arr = new ArrayList<Pair<Integer, Integer>>();
        for (int i = 0; i < n; i++) {
            arr.add(new Pair<Integer, Integer>(input.nextInt(), input.nextInt()));
        }
        Collections.sort(arr, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return o1.getKey() - o2.getKey();
            }
        });
        int time = 0;
        for (Pair<Integer, Integer> i : arr) {
            if (i.getKey() > time)
                time = i.getKey();
            time += i.getValue();
        }
        System.out.println(time);
    }
}

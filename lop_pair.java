import java.util.*;
import java.io.*;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair() {
        key = null;
        value = null;
    }

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

    public boolean isPrime() {
        int k = (Integer) key, v = (Integer) value;
        if (k < 2 || v < 2)
            return false;
        for (int i = 2; i <= (int) Math.sqrt(k); i++) {
            if (k % i == 0)
                return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(v); i++) {
            if (v % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return key + " " + value;
    }
}

public class lop_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean check = false;
            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
                Pair<Integer, Integer> p = new Pair<>(i, n - i);
                if (p.isPrime()) {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if (!check)
                System.out.println(-1);
        }
    }
}
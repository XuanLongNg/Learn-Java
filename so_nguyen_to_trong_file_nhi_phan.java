import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

public class Main {
    public static void Eratosthenes(boolean[] check) {
        check[0] = true;
        check[1] = true;
        for (int i = 2; i < (int) Math.sqrt(100005); i++)
            if (check[i] == false)
                for (int j = i * i; j < 100005; j += i)
                    check[j] = true;
    }

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        // Scanner input = new Scanner(System.in);
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        boolean[] check = new boolean[100005];
        for (int i = 0; i < 100005; i++)
            check[i] = false;
        Eratosthenes(check);
        // for (int i = 0; i < 10; i++)
        // System.out.println(check[i]);
        ArrayList<Integer> arr = (ArrayList<Integer>) file.readObject();
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // for (int i = 0; i < 50; i++)
        // arr.add(input.nextInt());
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (Integer i : arr) {
            if (check[i] == false && map.containsKey(i)) {
                map.put(Integer.valueOf(i), map.get(Integer.valueOf(i)) + 1);
            } else if (check[i] == false)
                map.put(Integer.valueOf(i), 1);
        }
        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }
}
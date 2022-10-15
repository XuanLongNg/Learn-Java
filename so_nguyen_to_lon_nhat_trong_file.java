import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

public class so_nguyen_to_lon_nhat_trong_file {
    public static void Eratosthenes(boolean[] check) {
        check[0] = true;
        check[1] = true;
        for (int i = 2; i < (int) Math.sqrt(1000005); i++)
            if (check[i] == false)
                for (int j = i * i; j < 1000005; j += i)
                    check[j] = true;
    }

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        // Scanner input = new Scanner(System.in);
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // for (int i = 0; i < 50; i++)
        // arr.add(input.nextInt());
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) file.readObject();
        boolean[] check = new boolean[1000005];
        for (int i = 0; i < 100005; i++)
            check[i] = false;
        Eratosthenes(check);
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        ArrayList<Integer> arrans = new ArrayList<Integer>();
        for (Integer i : arr) {
            if (check[i] == false && map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else if (check[i] == false) {
                arrans.add(i);
                map.put(i, 1);
            }
        }
        Collections.sort(arrans, Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            System.out.println(arrans.get(i) + " " + map.get(arrans.get(i)));
        }
    }
}
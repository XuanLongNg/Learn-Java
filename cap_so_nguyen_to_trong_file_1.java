import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

public class cap_so_nguyen_to_trong_file_1 {
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
        // ArrayList<Integer> arr1 = new ArrayList<Integer>(), arr2 = new
        // ArrayList<Integer>();
        // for (int i = 0; i < 4; i++)
        // arr1.add(input.nextInt());
        // for (int i = 0; i < 4; i++)
        // arr2.add(input.nextInt());
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("DATA1.in")),
                file2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) file1.readObject(),
                arr2 = (ArrayList<Integer>) file2.readObject();
        boolean[] check = new boolean[1000005];
        for (int i = 0; i < 100005; i++)
            check[i] = false;
        Eratosthenes(check);
        Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>(), map2 = new TreeMap<Integer, Integer>();
        for (Integer i : arr1) {
            map1.put(i, 1);
        }
        for (Integer i : arr2) {
            map2.put(i, 1);
        }
        for (Integer i : map1.keySet()) {
            // System.out.println(i + " " + check[i] + " " + check[1000000 - i] + " " +
            // map2.containsKey(1000000 - i));
            if (check[i] == false && i < 1000000 - i && map2.containsKey(1000000 - i) && check[1000000 - i] == false)
                System.out.println(i + " " + (1000000 - i));
        }
    }
}
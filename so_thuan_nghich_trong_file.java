import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

public class so_thuan_nghich_trong_file {
    public static boolean check(int k) {
        String s = String.valueOf(k);
        if (s.length() <= 1 || s.length() % 2 == 0)
            return false;
        for (int i = 0; i < s.length(); i++)
            if (Integer.valueOf(s.charAt(i)) % 2 == 0)
                return false;
        for (int i = 0; i < s.length() / 2; i++)
            if (Integer.valueOf(s.charAt(i)) != Integer.valueOf(s.charAt(s.length() - i - 1)))
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        // Scanner input = new Scanner(System.in);
        // ArrayList<Integer> arr1 = new ArrayList<Integer>(), arr2 = new
        // ArrayList<Integer>();
        // for (int i = 0; i < 6; i++)
        // arr1.add(input.nextInt());
        // for (int i = 0; i < 6; i++)
        // arr2.add(input.nextInt());
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("DATA1.in")),
                file2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) file1.readObject(),
                arr2 = (ArrayList<Integer>) file2.readObject();
        Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>(), map2 = new TreeMap<Integer, Integer>();
        for (Integer i : arr1) {
            if (check(i) && map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else if (check(i))
                map1.put(i, 1);
        }
        for (Integer i : arr2) {
            if (check(i) && map2.containsKey(i)) {
                map2.put(i, map2.get(i) + 1);
            } else if (check(i))
                map2.put(i, 1);
        }
        int count = 0;
        for (Integer i : map1.keySet()) {
            if (count == 10)
                break;
            // System.out.println(i + " " + check[i] + " " + check[1000000 - i] + " " +
            // map2.containsKey(1000000 - i));
            if (map2.containsKey(i)) {

                count++;
                System.out.println(i + " " + (map1.get(i) + map2.get(i)));
            }
        }
    }
}
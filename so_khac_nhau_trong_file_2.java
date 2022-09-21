import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < 100000; i++) {
            int s = f.readInt();
            if (map.containsKey(Integer.valueOf(s))) {
                map.put(Integer.valueOf(s), map.get(Integer.valueOf(s)) + 1);
            } else
                map.put(Integer.valueOf(s), 1);
        }
        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }

}
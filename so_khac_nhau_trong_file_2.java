import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream file = new FileInputStream("DATA.IN");
            Scanner input = new Scanner(file);
            Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] tmp = line.split(" ");
                for (String i : tmp) {
                    if (map.containsKey(Integer.valueOf(i))) {
                        map.put(Integer.valueOf(i), map.get(Integer.valueOf(i)) + 1);
                    } else
                        map.put(Integer.valueOf(i), 1);
                }
            }
            for (Integer i : map.keySet()) {
                System.out.println(i + " " + map.get(i));
            }
        } catch (FileNotFoundException e) {

        }
    }
}

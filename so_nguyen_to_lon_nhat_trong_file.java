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
        // ObjectInputStream file = new ObjectInputStream(new
        // FileInputStream("DATA.in"));
        // ArrayList<Integer> arr = (ArrayList<Integer>) file.readObject();
        boolean[] check = new boolean[1000005];
        for (int i = 0; i < 1000005; i++)
            check[i] = false;
        Eratosthenes(check);
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++)
            arr.add(input.nextInt());
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (Integer i : arr) {
            if (check[i] == false && map.containsKey(i)) {
                map.put(Integer.valueOf(i), map.get(Integer.valueOf(i)) + 1);
            } else if (check[i] == false)
                map.put(Integer.valueOf(i), 1);
        }
        int count = map.size() - 9;
        Stack<String> stack = new Stack<String>();
        for (Integer i : map.keySet()) {
            if (i <= count)
                continue;
            stack.push(String.valueOf(i) + " " + String.valueOf(map.get(i)));
        }
        while (stack.empty() == false) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
import java.util.*;

public class vong_tron {
    public static boolean catnhau(int a, int b, int k) {
        return a <= k && k <= b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Stack<Character> stack = new Stack<Character>();
        stack.push(line.charAt(0));
        for (int i = 1; i < line.length(); i++) {
            if (!stack.isEmpty() && line.charAt(i) == stack.peek()) {
                stack.pop();
            } else
                stack.push(line.charAt(i));
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>(), map1 = new HashMap<Character, Integer>();
        int count = 0;
        while (!stack.isEmpty()) {
            if (map.containsKey(stack.peek()))
                map1.put(stack.pop(), count);
            else
                map.put(stack.pop(), count);
            count++;
            // System.out.print(stack.pop() + " ");
        }
        count = 0;
        ArrayList<Character> check = new ArrayList<>();
        for (Character i : map.keySet()) {
            int d = map.get(i), c = map1.get(i);
            for (Character j : map.keySet()) {
                int tmp = map.get(j), tmp1 = map1.get(j);
                if (j != i && ((catnhau(d, c, tmp) && !catnhau(d, c, tmp1))
                        || (!catnhau(d, c, tmp) && catnhau(d, c, tmp1)))) {
                    if (check.contains(j))
                        continue;
                    count++;
                    // System.out.println(i + " " + d + " " + c + "\n" + j + " " + tmp + " " +
                    // tmp1);
                }
            }
            check.add(i);
        }
        System.out.println(count);
    }
}
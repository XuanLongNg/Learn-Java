import java.util.*;

public class loai_bo_100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            Stack<Integer> stack = new Stack<Integer>();
            for (int i = 0; i < n.length(); i++) {
                if (stack.size() < 2) {
                    stack.push(i);
                    continue;
                }
                int k = stack.lastElement(), h = stack.elementAt(stack.size() - 2);
                // System.out.println();
                if (n.charAt(k) == '0' && n.charAt(h) == '1' && n.charAt(i) == '0') {
                    stack.pop();
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
            int ans = 0;
            for (int i = 1; i < stack.size(); i++) {
                ans = Math.max(ans, stack.elementAt(i) - stack.elementAt(i - 1) - 1);
            }
            if (stack.empty())
                ans = n.length();
            else {
                ans = Math.max(ans, stack.elementAt(0));
                ans = Math.max(ans, n.length() - stack.lastElement() - 1);
            }
            System.out.println(ans);
        }
    }
}
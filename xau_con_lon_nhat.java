import java.util.*;

public class xau_con_lon_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        Stack<Character> stack = new Stack<Character>(), ans = new Stack<Character>();
        for (int i = 0; i < n.length(); i++) {
            while (stack.size() > 0 && Character.getNumericValue(stack.peek()) < Character.getNumericValue(n.charAt(i)))
                stack.pop();
            stack.push(n.charAt(i));
        }

        while (stack.size() > 0)
            ans.push(stack.pop());
        while (ans.size() > 0)
            System.out.print(ans.pop());
    }
}

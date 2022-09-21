import java.util.*;

public class kiem_tra_day_ngoac_dung {
    public static boolean check(String n) {
        Stack<String> stk = new Stack<String>();
        for (int j = 0; j < n.length(); j++) {
            if (n.charAt(j) == '{' || n.charAt(j) == '[' || n.charAt(j) == '(')
                stk.push(String.valueOf(n.charAt(j)));
            else {
                if (stk.size() == 0)
                    return false;
                // System.out.println(n.charAt(j) + " " + stk.peek());
                if (n.charAt(j) == '}' && stk.peek().equals("{") == false)
                    return false;
                else if (n.charAt(j) == ']' && stk.peek().equals("[") == false)
                    return false;
                else if (n.charAt(j) == ')' && stk.peek().equals("(") == false)
                    return false;
                else
                    stk.pop();
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            if (check(n) == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

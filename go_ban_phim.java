import java.util.*;

public class go_ban_phim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String lines = "";
        Stack<Character> stk1 = new Stack<Character>(), stk2 = new Stack<Character>();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '<') {
                if (stk1.size() > 0) {
                    stk2.push(stk1.pop());
                }
            } else if (line.charAt(i) == '>') {
                if (stk2.size() > 0) {
                    stk1.push(stk2.pop());
                }
            } else if (line.charAt(i) == '-') {
                if (stk1.size() > 0)
                    stk1.pop();
            } else {
                stk1.push(line.charAt(i));
            }
        }
        while (stk1.empty() == false) {
            stk2.push(stk1.peek());
            stk1.pop();
        }
        while (stk2.empty() == false) {
            System.out.print(stk2.peek());
            stk2.pop();
        }
    }
}

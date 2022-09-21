import java.util.*;

public class dau_tu_chung_khoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            Stack<Integer> stack = new Stack<Integer>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (stack.size() == 0) {
                    System.out.print("1 ");
                    stack.push(arr[i]);
                } else if (stack.peek() <= arr[i]) {
                    stack.push(arr[i]);
                    System.out.print(stack.size() + " ");
                } else {
                    stack.pop();
                    System.out.print("1 ");
                    stack.push(arr[i]);
                }
            }
            System.out.println();
        }
    }
}

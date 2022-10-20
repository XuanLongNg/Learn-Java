import java.util.*;

public class dau_tu_chung_khoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            Stack<Integer> stack = new Stack<Integer>(), tmp = new Stack<Integer>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
                if (stack.size() == 0) {
                    System.out.print("1 ");
                    stack.push(arr[i]);
                    tmp.push(i);
                } else if (stack.peek() <= arr[i]) {
                    while (stack.size() > 1 && stack.peek() <= arr[i]) {
                        stack.pop();
                        tmp.pop();
                    }
                    if (stack.peek() <= arr[i]) {
                        stack.pop();
                        tmp.pop();
                        System.out.print((i + 1) + " ");
                    } else
                        System.out.print((i - tmp.peek()) + " ");
                    stack.push(arr[i]);
                    tmp.push(i);
                } else {
                    System.out.print("1 ");
                    stack.push(arr[i]);
                    tmp.push(i);
                }
            }
            System.out.println();
        }
    }
}

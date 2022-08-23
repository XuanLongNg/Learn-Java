import java.util.Scanner;

public class so_chinh_phuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            if ((int) Math.sqrt(n) * Math.sqrt(n) == n) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }
}

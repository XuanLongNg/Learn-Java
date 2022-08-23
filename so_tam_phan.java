import java.util.Scanner;

public class so_tam_phan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            boolean check = true;
            while (n > 0) {
                if (n % 10 != 0 && n % 10 != 1 && n % 10 != 2) {
                    check = false;
                    break;
                }
                n /= 10;
            }
            if (check == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
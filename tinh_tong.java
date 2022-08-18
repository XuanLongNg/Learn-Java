import java.util.Scanner;

public class tinh_tong {
    public static void main(String[] args) {
        int t;
        Scanner input = new Scanner(System.in);
        t = input.nextInt();
        while (t > 0) {
            t--;
            long n = input.nextLong();
            long total = n * (n + 1) / 2;
            System.out.println(total);
        }
    }
}

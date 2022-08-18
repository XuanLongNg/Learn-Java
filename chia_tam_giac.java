import java.util.Scanner;

public class chia_tam_giac {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        while (a > 0) {
            a--;
            long n = input.nextLong(), k = input.nextLong();
            for (int i = 1; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt((double) i * k * k / n));
            }
            System.out.println("");
        }
    }
}

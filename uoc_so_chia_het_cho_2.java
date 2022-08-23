import java.util.Scanner;

public class uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            t--;
            int n = input.nextInt();
            if (n % 2 != 0) {
                System.out.println('0');
                continue;
            }
            int count = 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (n / i != i && (n / i) % 2 == 0)
                        count++;
                    if (i % 2 == 0)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}

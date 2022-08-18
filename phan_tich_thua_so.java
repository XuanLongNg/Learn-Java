import java.util.Scanner;

public class phan_tich_thua_so {
    public static void phan_tich(int n) {
        int i = 2;
        while (i < Math.sqrt(n)) {
            int k = 0;
            while (n % i == 0) {
                k += 1;
                n /= i;
            }
            if (k > 0)
                System.out.printf("%d(%d) ", i, k);
            if (i % 2 == 0)
                i += 1;
            else
                i += 2;
        }
        if (n > 1)
            System.out.printf("%d(1)", n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(), count = 1;
        while (t > 0) {
            System.out.printf("Test %d: ", count);
            count++;
            t--;
            int n = input.nextInt();
            phan_tich(n);
            System.out.println("");
        }
    }
}

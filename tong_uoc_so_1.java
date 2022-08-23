import java.util.Scanner;

public class tong_uoc_so_1 {
    public static int[] check = new int[2000001];

    public static void Eratosthenes() {
        check[0] = 1;
        check[1] = 1;
        for (int i = 2; i * i < 2000001; ++i) {
            if (check[i] == 0) {
                for (int j = i * i; j < 2000001; j += i)
                    check[j] = 1;
            }
        }
    }

    public static long total(int n) {
        long count = 0, i = 2;
        if (check[n] == 0)
            return n;
        while (i <= Math.sqrt(n)) {
            if (check[n] == 0) {
                break;
            }
            while (n % i == 0) {
                count += i;
                n /= i;
            }
            if (i % 2 == 0)
                i++;
            else
                i += 2;
        }
        if (n > 1)
            count += n;
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Eratosthenes();
        int t = input.nextInt();
        long count = 0;
        while (t > 0) {
            t--;
            int n = input.nextInt();
            count += total(n);
        }
        System.out.println(count);
    }
}

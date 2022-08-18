import java.util.Scanner;

public class so_nguyen_to {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        while (a > 0) {
            a--;
            int n = input.nextInt();
            if (isPrime(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

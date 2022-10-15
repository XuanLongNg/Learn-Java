import java.util.*;

class Rectange {
    private int width;
    private int height;

    public Rectange() {
        width = 1;
        height = 1;
    }

    public Rectange(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

public class nhap {
    // public static void main(String args[]) {
    // Scanner input = new Scanner(System.in);
    // int x = input.nextInt(), y = input.nextInt();
    // if (x > 0 && y > 0) {
    // int area = x * y, parimeter = (x + y) * 2;
    // System.out.println("Area: " + area + "\n" + "Parimeter: " + parimeter);
    // }
    // }

    // tong chan tu 1-100
    // public static void main(String[] args) {
    // System.out.println(50 * (2 + 100) / 2);
    // }

    // tong boi so 7 tu 1-100
    // public static void main(String[] args) {
    // System.out.println(14 * (1 + 98) / 2);
    // }

    // giai thua
    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // long n = input.nextLong(), ans = 1;
    // for (int i = 2; i <= n; i++)
    // ans *= i;
    // System.out.println(ans);
    // }

    // GCD 2 so
    // public static long GCD(long a, long b) {
    // if (b == 0)
    // return a;
    // return GCD(b, a % b);
    // }

    // public static long LCM(long a, long b) {
    // return (a * b) / GCD(a, b);
    // }

    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // long n = input.nextLong(), m = input.nextLong();
    // System.out.println("GCD: " + GCD(n, m) + "\nLCM: " + LCM(n, m));
    // }

    // fibonacci thu n
    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // long[] fibonacci = new long[92];
    // fibonacci[0] = 1;
    // fibonacci[1] = 1;
    // for (int i = 2; i < 92; i++) {
    // fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    // }
    // int n = input.nextInt();
    // System.out.println(fibonacci[n - 1]);
    // }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Currency k;
        String n = input.nextLine();
        k.getInstance(n);
        System.out.println(k + " " + k.getCurrencyCode());
    }
}

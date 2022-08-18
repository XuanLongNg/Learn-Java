import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("VSN");
        } else if (a == 0 && b != 0) {
            System.out.println("VN");
        } else {
            double ans = b;
            System.out.printf("%.2f", -ans / a);
        }
    }
}

import java.util.*;

public class danh_sach_ke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ", i + 1);
            for (int j = 0; j < n; j++) {
                int k = input.nextInt();
                if (k == 1)
                    System.out.print((j + 1) + " ");

            }
            System.out.println();
        }
    }
}

import java.util.*;

public class danh_sach_canh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = input.nextInt();
                if (k == 1 && j > i)
                    System.out.printf("(%d,%d)\n", i + 1, j + 1);

            }
        }
    }
}

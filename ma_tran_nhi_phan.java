import java.util.*;

public class ma_tran_nhi_phan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), count = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < 3; j++) {
                int k = input.nextInt();
                if (k == 1)
                    temp++;
                else
                    temp--;
            }
            // System.out.println(temp);
            if (temp > 0)
                count++;
        }
        System.out.println(count);
    }
}

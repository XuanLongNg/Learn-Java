import java.util.Scanner;

public class chu_so_4_va_chu_so_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String t = input.nextLine();
        int count = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '4' || t.charAt(i) == '7')
                count++;
        }
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}

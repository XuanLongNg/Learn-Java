import java.util.*;

public class dao_tu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String n = input.nextLine();
            String[] temp = n.split(" ");
            for (String i : temp) {
                for (int j = i.length() - 1; j >= 0; j--) {
                    System.out.print(i.charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

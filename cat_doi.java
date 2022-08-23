import java.util.Scanner;

public class cat_doi {
    public static int convert(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans += n.charAt(i) - '0';
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        int t = convert(temp);
        while (t > 0) {
            String n = scanner.nextLine();
            if (n == "")
                continue;
            t--;
            String tmp = "";
            boolean check = false;
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == '1') {
                    check = true;
                    tmp += "1";
                } else if (n.charAt(i) == '8' || n.charAt(i) == '9' || n.charAt(i) == '0') {
                    tmp += "0";
                } else {
                    tmp = "INVALID";
                    break;
                }
            }
            if (tmp == "INVALID") {
                System.out.println("INVALID");
                continue;
            }
            if (!check)
                System.out.println("INVALID");

            int k = 0;
            while (k < n.length() && tmp.charAt(k) == '0')
                k++;
            for (int i = k; i < n.length(); i++)
                System.out.print(tmp.charAt(i));
            System.out.println("");
        }
    }
}
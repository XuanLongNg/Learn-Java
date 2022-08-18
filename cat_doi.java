import java.util.Scanner;

public class cat_doi {
    public static String convert(int n) {
        String ans="";
        while(n>=0){
            ans+= char(n%10);
            
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            t--;
            String n = scanner.nextInt();

            for (int i = 0; i < k; i++) {
                if (i == 0 && n.charAt(i) == '0') {
                    tmp = "INVALID";
                    break;
                }
                if (n.charAt(i) == '0' || n.charAt(i) == '1') {
                    tmp += n.charAt(i);
                } else if (n.charAt(i) == '8' || n.charAt(i) == '9') {
                    tmp += "0";
                } else {
                    tmp = "INVALID";
                    break;
                }
            }
            k = 0;
            while (k < n.length()) {
                if (tmp.charAt(k) != '0')
                    break;
                k++;
            }
            for (int i = k; i < n.length(); i++)
                ans += tmp.charAt(i);
            if (tmp == "INVALID" || k == n.length()) {
                System.out.println("INVALID");
                continue;
            } else
                System.out.println(ans);
        }
    }
}

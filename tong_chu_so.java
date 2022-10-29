import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;

public class tong_chu_so {
    public static boolean isNumeric(char k) {
        int tmp = (int) k;
        if ((int) '0' <= tmp && tmp <= (int) '9')
            return true;
        return false;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
        ObjectInputStream file = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) file.readObject();
        // Scanner input = new Scanner(System.in);
        // int n = Integer.valueOf(input.nextLine());
        // ArrayList<String> arr = new ArrayList<String>();
        // for (int i = 0; i < n; i++)
        // arr.add(input.nextLine());
        for (String i : arr) {
            int total = 0;
            String num = "";
            for (int j = 0; j < i.length(); j++) {
                if (isNumeric(i.charAt(j))) {
                    num += i.charAt(j);
                    total += (int) i.charAt(j) - (int) '0';
                }
            }
            BigInteger n1 = new BigInteger(num);
            System.out.println(n1 + " " + total);
        }
    }
}
import java.util.*;
import java.io.*;

public class chuan_hoa_va_sap_xep {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("DANHSACH.in"));
        // Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        while (input.hasNextLine()) {
            String n = input.nextLine();
            n = n.toLowerCase();
            n = n.trim();
            String[] ans = n.split("[, ?.@]+");
            String fans = "";
            for (String a : ans) {
                char[] rep = Character.toChars((int) a.charAt(0) - 32);
                // System.out.println(rep);
                StringBuilder temp = new StringBuilder(a);
                temp.setCharAt(0, rep[0]);
                fans += String.valueOf(temp) + " ";
            }
            arr.add(fans);
        }
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] tmp1 = o1.split(" "), tmp2 = o2.split(" ");
                // System.out.println(tmp1[tmp1.length - 1] + " " + tmp2[tmp2.length - 1]);
                if (tmp1[tmp1.length - 1].equals(tmp2[tmp2.length - 1])) {
                    return o1.compareTo(o2);
                }
                return tmp1[tmp1.length - 1].compareTo(tmp2[tmp2.length - 1]);
            }
        });
        for (String i : arr)
            System.out.println(i);
    }
}

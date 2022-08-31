import java.util.*;

public class dia_chi_email {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        ArrayList<String> ans = new ArrayList<String>();
        while (t-- > 0) {
            String n = input.nextLine();
            n = n.toLowerCase();
            n = n.trim();
            String[] arr = n.split("[, ?.@]+");
            String temp = arr[arr.length - 1];
            // System.out.println(arr.length);
            for (int i = 0; i < arr.length - 1; i++)
                temp += (arr[i].charAt(0));
            int index = 1;
            if (ans.contains(temp))
                index++;
            while (ans.contains(temp + index))
                index++;
            if (index != 1)
                temp += index;
            ans.add(temp);
        }
        for (String a : ans)
            System.out.println(a + "@ptit.edu.vn");
    }
}

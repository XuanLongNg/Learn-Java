import java.util.*;

public class rut_gon_xau_ki_tu {
    public static void erase(ArrayList<String> arr, int n) {
        int i = 1;
        while (i < n) {
            boolean check = false;
            if (arr.get(i).equals(arr.get(i - 1))) {
                arr.remove(i - 1);
                arr.remove(i - 1);
                n -= 2;
                if (i > 1)
                    i -= 1;
            } else
                i += 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.nextLine();
        String[] tmp = n.split("");
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(tmp));
        erase(arr, arr.size());
        if (arr.size() == 0) {
            System.out.println("Empty String");
            return;
        }
        for (String i : arr)
            System.out.print(i);
    }
}

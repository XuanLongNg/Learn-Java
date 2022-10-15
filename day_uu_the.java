import java.util.*;

public class day_uu_the {
    public static boolean Check(ArrayList<Integer> arr) {
        int demle = 0, demchan = 0, n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) % 2 == 0)
                demchan++;
            else
                demle++;
        }
        if (demchan > demle && n % 2 == 0)
            return true;
        else if (demchan < demle && n % 2 != 0)
            return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String tmp = input.nextLine();
        while (t-- > 0) {
            String line = input.nextLine();
            String[] lines = line.split(" ");
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 0; i < lines.length; i++) {
                arr.add(Integer.parseInt(lines[i]));
            }
            // for (int i = 0; i < arr.size(); i++)
            // System.out.print(arr.get(i) + " ");
            if (Check(arr))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

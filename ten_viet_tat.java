import java.util.*;
import java.io.*;

class ob {
    String name, summary;

    ob(String name) {
        this.name = name;
        String[] tmp = name.split(" ");
        summary = "";
        for (int i = 0; i < tmp.length; i++) {
            summary += tmp[i].substring(0, 1) + ".";
        }
        summary = summary.substring(0, summary.length() - 1);
    }

    boolean check(String k) {
        int count = 0;
        // System.out.println(summary + " " + count);
        if (summary.length() != k.length())
            return false;
        for (int i = 0; i < k.length(); i++) {
            if (summary.charAt(i) != k.charAt(i))
                count++;
        }
        return count == 1;
    }

    public String getName() {
        return name.split(" ")[name.split(" ").length - 1];
    }

    public String getFName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ten_viet_tat {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("DANHSACH.in"));
        // Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<ob> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new ob(input.nextLine()));
        }
        Collections.sort(arr, new Comparator<ob>() {
            @Override
            public int compare(ob o1, ob o2) {
                if (o1.getName().equals(o2.getName()))
                    return o1.getFName().compareTo(o2.getFName());
                return o1.getName().compareTo(o2.getName());
            }
        });
        int m = Integer.valueOf(input.nextLine());
        for (int i = 0; i < m; i++) {
            String tmp = input.nextLine();
            // System.out.println(tmp);
            for (ob j : arr)
                if (j.check(tmp) == true)
                    System.out.println(j);
        }
    }
}
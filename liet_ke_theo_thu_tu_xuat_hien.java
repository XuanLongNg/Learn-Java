import java.util.*;
import java.io.*;
import java.text.*;

public class liet_ke_theo_thu_tu_xuat_hien {
    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner input = new Scanner(new File("VANBAN.in"));
        ArrayList<String> lines = (ArrayList<String>) o1.readObject();
        // Scanner input = new Scanner(System.in);
        // ArrayList<String> lines = new ArrayList<String>();
        // for (int i = 0; i < 3; i++) {
        // String[] tmp = input.nextLine().split(" ");
        // for (String line : tmp)
        // lines.add(line);
        // }
        ArrayList<String> map = new ArrayList<String>(), map2 = new ArrayList<String>();
        ArrayList<String> ans = new ArrayList<String>();
        lines.forEach(s -> {
            InputStream is = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
            Scanner ss = new Scanner(is);
            while (ss.hasNext()) {
                String x = ss.next().toLowerCase();
                if (!map.contains(x))
                    map.add(x);
            }
        });
        while (input.hasNext()) {
            String k = input.next().toLowerCase();
            if (map2.containsKey(k) == false) {
                ans.add(k);
                map2.add(k);
            }
        }
        for (String k : ans) {
            if (k.equals("") || k.equals(" "))
                continue;
            if (map.containsKey(k) && map2.containsKey(k))
                System.out.println(k);
        }
    }
}
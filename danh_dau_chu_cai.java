import java.util.*;

public class danh_dau_chu_cai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String t = input.nextLine();
        String[] tmp = t.split("");
        Set<String> set = new HashSet<String>(Arrays.asList(tmp));
        System.out.println(set.size());
    }
}

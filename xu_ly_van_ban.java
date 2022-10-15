import java.util.*;

public class xu_ly_van_ban {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tmp = "";
        while (input.hasNextLine()) {
            String line = input.nextLine();
            tmp += line + " ";
        }
        tmp = tmp.toLowerCase().trim();
        String[] ans = tmp.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        String temp = "";
        for (String i : ans) {
            if (i.equals(" ") == false && i.equals("") == false) {
                if (i.contains(".") || i.contains("?") ||
                        i.contains("!")) {
                    i = i.replace("?", "").replace("!", "").replace(".", "");
                    temp += i + " ";
                    temp = temp.trim();
                    temp = temp.toUpperCase().charAt(0) + temp.substring(1);
                    list.add(temp);
                    temp = "";
                } else
                    temp += i + " ";
            }
        }
        for (String i : list)
            System.out.println(i);
    }
}

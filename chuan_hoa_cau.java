import java.util.*;

public class chuan_hoa_cau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tmp = "";
        while (input.hasNextLine()) {
            String line = input.nextLine();
            tmp += line;
            if (line.contains(".") || line.contains("?") ||
                    line.contains("!")) {
                tmp += " ";
            } else
                tmp += ". ";
        }
        tmp = tmp.toLowerCase().trim();
        String[] ans = tmp.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        String temp = "";
        for (String i : ans) {
            if (i.equals(" ") == false && i.equals("") == false) {
                if (i.contains(".") || i.contains("?") ||
                        i.contains("!")) {
                    if (i.equals(".") || i.equals("?") || i.equals("!"))
                        temp = temp.substring(0, temp.length() - 1);
                    temp += i;
                    temp = temp.trim();
                    temp = temp.toUpperCase().charAt(0) + temp.substring(1);
                    i = i.replace(" ?", "?").replace(" !", "!").replace(" .", ".");
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

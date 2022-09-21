import java.util.*;
import java.io.*;

class FullName {
    private String name;

    public FullName() {
        name = "";
    }

    public String chuan_hoa(String name) {
        name = name.trim();
        name = name.toLowerCase();
        String ans = "";
        String[] tmp = name.split("[, ?.@]+");
        for (String i : tmp) {
            char[] rep = Character.toChars((int) i.charAt(0) - 32);
            StringBuilder temp = new StringBuilder(i);
            temp.setCharAt(0, rep[0]);
            ans += temp.toString();
            ans += " ";
        }
        return ans;
    }

    public FullName(String name) {
        this.name = chuan_hoa(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("DATA.in"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals("END"))
                break;
            FullName a = new FullName(line);
            System.out.println(a);
        }
    }
}

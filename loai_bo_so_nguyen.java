import java.util.*;
import java.io.*;

public class Main {
    public static boolean isInteger(String value) {
        if (value == null || value.equals("")) {
            return false;
        }
        try {
            int iVal = Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            // System.out.println("Cannot parse the string to integer");
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("DATA.in"));
        ArrayList<String> arr = new ArrayList<String>();
        while (input.hasNextLine()) {
            String n = input.nextLine();
            String[] tmp = n.split(" ");
            for (String i : tmp) {
                if (isInteger(i) == false) {
                    arr.add(i);
                    // System.out.print(i+' ');
                }
            }
        }
        // System.out.println();
        Collections.sort(arr);
        for (String i : arr)
            System.out.print(i + " ");
    }
}

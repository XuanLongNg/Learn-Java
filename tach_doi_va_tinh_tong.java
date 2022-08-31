import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        try {
            File obj = new File("DATA.in");
            Scanner input = new Scanner(obj);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                while (line.length() > 1) {
                    BigInteger n = new BigInteger(line.substring(0, line.length() / 2)),
                            k = new BigInteger(line.substring(line.length() / 2, line.length()));
                    n = n.add(k);
                    System.out.println(n);
                    line = String.valueOf(n);
                }

            }
        } catch (FileNotFoundException e) {

        }
    }
}

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class doc_file_van_ban {
    public static void main(String[] args) {
        try {
            File myObj = new File("DATA.in");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File don't exits");
            e.printStackTrace();
        }
    }
}

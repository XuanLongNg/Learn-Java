import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
	public static boolean isInteger(String s) {
	    
	    if(s == null || s.equals("")) {
	     
	      return false;
	    }
	    
	    try {
	      int iVal = Integer.parseInt(s);
	      return true;
	    }
	    catch(NumberFormatException e) {
	      System.out.println("Cannot parse the string to integer");
	    }
	    return false;
	  }
    public static void main(String[] args) {
        try {
            File myObj = new File("DATA.in");
            Scanner myReader = new Scanner(myObj);
            int ans = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arr = data.split(" ");

                for (String i : arr) {
                    if (i.length() > 9)
                        continue;
                    if (isInteger(i))
                        ans += Integer.valueOf(i);
                }
                System.out.println(data);
            }
            System.out.println(ans);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File don't exits");
            e.printStackTrace();
        }
    }
}
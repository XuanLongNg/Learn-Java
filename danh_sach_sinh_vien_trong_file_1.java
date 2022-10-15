import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

class Student {
    private String ID;
    private String name;
    private String classt;
    private String email;

    public Student() {
        ID = "";
        name = "";
        classt = "";
        email = "";
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

    public String getID() {
        return ID;
    }

    public Student(String ID, String name, String classt, String email) {
        this.ID = ID;
        this.name = chuan_hoa(name);
        this.classt = classt;
        this.email = email;
    }

    @Override
    public String toString() {
        return ID + " " + name + classt + " " + email;
    }
}

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

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        InputStream file = new FileInputStream("SINHVIEN.in");
        Scanner input = new Scanner(file.read());
        int n = Integer.valueOf(input.nextLine());
        List<Student> arr = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            arr.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o2, Student o1) {
                int n = o1.getID().length(), m = o2.getID().length(), k = Math.min(n, m);
                for (int i = 0; i < k; i++) {
                    if ((int) o1.getID().charAt(i) != (int) (o2.getID().charAt(i)))
                        return (int) (o1.getID().charAt(i))
                                - (int) (o2.getID().charAt(i));
                }
                return n - m;
            }
        });
        for (Student i : arr) {
            System.out.println(i);
        }
    }
}

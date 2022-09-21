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

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.valueOf(input.nextLine());
        List<Student> arr = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            arr.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o2, Student o1) {
                String a1 = o1.getID(), a2 = o2.getID();
                int i = a1.length() - 1, j = a2.length() - 1;
                while (isInteger(String.valueOf(a1.charAt(i))))
                    i--;
                while (isInteger(String.valueOf(a2.charAt(j))))
                    j--;
                i++;
                j++;
                return Integer.valueOf(o2.getID().substring(j, o2.getID().length()))
                        - Integer.valueOf(o1.getID().substring(i, o1.getID().length()));
            }
        });
        for (Student i : arr) {
            System.out.println(i);
        }
    }
}

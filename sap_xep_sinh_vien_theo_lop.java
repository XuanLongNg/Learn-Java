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

    public String getID() {
        return ID;
    }

    public String getClasst() {
        return classt;
    }

    public Student(String ID, String name, String classt, String email) {
        this.ID = ID;
        this.name = name;
        this.classt = classt;
        this.email = email;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + classt + " " + email;
    }
}

public class sap_xep_sinh_vien_theo_lop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        List<Student> arr = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            arr.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                String n = o1.getClasst(), m = o2.getClasst();
                if (n.equals(m)) {
                    n = o1.getID();
                    m = o2.getID();
                    int k = Math.min(n.length(), m.length());
                    for (int i = 0; i < k; i++) {
                        if ((int) n.charAt(i) != m.charAt(i))
                            return n.charAt(i) - m.charAt(i);
                    }
                    return n.length() - m.length();
                }
                int k = Math.min(n.length(), m.length());
                for (int i = 0; i < k; i++) {
                    if ((int) n.charAt(i) != m.charAt(i))
                        return n.charAt(i) - m.charAt(i);
                }
                return n.length() - m.length();
            }
        });
        for (Student i : arr) {
            System.out.println(i);
        }
    }
}

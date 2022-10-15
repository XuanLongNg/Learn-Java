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

public class liet_ke_sinh_vien_theo_nganh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        List<Student> arr = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            arr.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int m = Integer.valueOf(input.nextLine());
        String[] query = new String[m];
        for (int i = 0; i < m; i++)
            query[i] = input.nextLine();
        for (int i = 0; i < m; i++) {
            String s = query[i];
            s = s.toUpperCase().charAt(0) + s.toLowerCase().substring(1);
            if (s.equals("Ke toan"))
                s = "DCKT";
            else if (s.equals("Cong nghe thong tin"))
                s = "DCCN";
            else if (s.equals("An toan thong tin"))
                s = "DCAT";
            else if (s.equals("Vien thong"))
                s = "DCVT";
            else
                s = "DCDT";
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", query[i].toUpperCase());
            for (Student j : arr) {
                if (j.getClasst().charAt(0) == 'E' && (s.equals("DCCN") || s.equals("DCAT")))
                    continue;
                if (j.getID().substring(3, 7).equals(s))
                    System.out.println(j);
            }
        }
    }
}

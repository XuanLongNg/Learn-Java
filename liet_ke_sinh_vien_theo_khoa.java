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

public class liet_ke_sinh_vien_theo_khoa {
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
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", query[i]);
            for (Student j : arr) {
                if (j.getClasst().substring(1, 3).equals(query[i].substring(2)))
                    System.out.println(j);
            }
        }
    }
}

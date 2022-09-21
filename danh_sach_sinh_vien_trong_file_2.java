import java.util.*;
import java.io.*;

class Student {
    private String ID;
    private String name;
    private String birth;
    private String classt;
    private double gpa;

    public Student() {
        ID = "";
        name = "";
        birth = "";
        classt = "";
        gpa = 0.0;
    }

    public String chuan_hoa(String date) {
        String ans = date;
        if (date.charAt(2) != '/')
            ans = "0" + ans;
        if (ans.charAt(5) != '/') {
            ans = ans.substring(0, 3) + "0" + ans.substring(3, ans.length());
        }
        return ans;
    }

    public Student(int id, String name, String classt, String birth, double gpa) {
        birth = chuan_hoa(birth);
        ID = "B20DCCN";
        for (int i = String.valueOf(id).length(); i < 3; i++)
            ID += "0";
        ID += String.valueOf(id);
        this.name = name;
        this.birth = birth;
        this.classt = classt;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + classt + " " + birth + " " + String.format("%.2f", gpa);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("SV.in"));
        int n = Integer.valueOf(input.nextLine());
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Student(i + 1, input.nextLine(), input.nextLine(), input.nextLine(),
                    Double.valueOf(input.nextLine()));
        }
        for (Student i : arr) {
            System.out.println(i);
        }
    }
}

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

class Student {
    private String ID;
    private String name;
    private String phoneNum;
    private String email;

    public Student() {
        ID = "";
        name = "";
        phoneNum = "";
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

    public String getId() {
        return ID;
    }

    public String getName() {
        String[] k = name.split(" ");
        return k[k.length - 1];
    }

    public String getFName() {
        return name;
    }

    public Student(String ID, String name, String phoneNum, String email) {
        this.ID = ID;
        this.name = chuan_hoa(name);
        this.phoneNum = phoneNum;
        this.email = email;
    }

    @Override
    public String toString() {
        return ID + " " + name + phoneNum + " " + email;
    }
}

public class sap_xep_danh_sach_sinh_vien {

    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        Scanner input = new Scanner(new File("SINHVIEN.in"));
        // Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        List<Student> arr = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            arr.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getName().equals(o2.getName())) {
                    if (o1.getFName().equals(o2.getFName())) {
                        return o1.getId().compareTo(o2.getId());
                    }
                    return o1.getFName().compareTo(o2.getFName());
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student i : arr) {
            System.out.println(i);
        }
    }
}
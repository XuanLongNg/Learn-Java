import java.util.*;

class Student {
    private String ID;
    private String name;
    private String date;
    private String stuClass;
    private double gpa;

    public Student() {
        ID = "NULL";
        name = "NULL";
        date = "NULL";
        stuClass = "NULL";
        gpa = 0;
    }

    public String chuan_hoa(String date) {
        String ans = date;
        if (ans.charAt(2) != '/')
            ans = "0" + ans;
        if (ans.charAt(5) != '/')
            ans = ans.substring(0, 3) + "0" + ans.substring(3);
        return ans;
    }

    public Student(int ID, String name, String stuClass, String date, double gpa) {
        this.ID = "B20DCCN";
        for (int i = 0; i < 3 - String.valueOf(ID).length(); i++)
            this.ID += "0";
        this.ID += String.valueOf(ID);
        this.name = name;
        this.stuClass = stuClass;
        this.date = chuan_hoa(date);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + stuClass + " " + date + " " + String.format("%.2f", gpa);
    }
}

public class danh_sach_doi_tuong_sinh_vien_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String tmp = input.nextLine();
        ArrayList<Student> list = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine(), class1 = input.nextLine(), date = input.nextLine(), gpa = input.nextLine();
            list.add(new Student(i + 1, name, class1, date, Double.valueOf(gpa)));
        }
        for (Student i : list) {
            System.out.println(i);
        }
    }
}

import java.util.*;

class Student {
    private String id;
    private String name;
    private double gpa;
    private String appellation;

    public Student() {
        name = "NULL";
        gpa = 0;
    }

    public Student(int id, String name, double gpa) {
        this.id = "HS" + String.format("%02d", id);
        this.name = name;
        this.gpa = gpa;
        if (gpa >= 9)
            appellation = "XUAT SAC";
        else if (gpa >= 8)
            appellation = "GIOI";
        else if (gpa >= 7)
            appellation = "KHA";
        else if (gpa >= 5)
            appellation = "TB";
        else
            appellation = "YEU";
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", gpa) + " " + appellation;
    }
}

public class bang_diem_hoc_sinh {
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.nextLine();
            String name = input.nextLine();
            double x = 0;
            for (int j = 0; j < 10; j++) {
                if (j <= 1)
                    x += input.nextDouble() * 2;
                else
                    x += input.nextDouble();
            }
            x /= 12.0;
            x = Math.round(x * 10.0);
            x /= 10.0;
            // System.out.println("\n" + avg + " " + lenP);
            students.add(new Student(i + 1, name, x));
        }
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o2, Student o1) {
                if (o1.getGpa() < o2.getGpa())
                    return -1;
                else if (o1.getGpa() > o2.getGpa())
                    return 1;
                return 0;
            }
        });
        for (Student p : students) {
            System.out.println(p);
        }
    }
}
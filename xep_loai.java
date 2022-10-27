import java.util.*;
import java.io.*;

class Student {
    static int count;
    String id, name, title;
    int ranking;
    double p1, p2, p3, avg;

    Student(String name, double p1, double p2, double p3) {
        id = String.format("SV%02d", ++count);
        name = name.trim().toLowerCase();
        String[] tmp = name.split("[,. @!]+");
        name = "";
        for (String i : tmp)
            if (i != "" && i != " ")
                name += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        avg = (p1 * 5 + p2 * 7 + p3 * 8) / 20;
        avg = Math.round(avg * 100) / 100.0;
        if (avg >= 8)
            title = "GIOI";
        else if (avg >= 6.5)
            title = "KHA";
        else if (avg >= 5)
            title = "TRUNG BINH";
        else
            title = "KEM";
    }

    String getId() {
        return id;
    }

    double getAvg() {
        return avg;
    }

    @Override
    public String toString() {
        return id + " " + name + String.format("%.2f", avg) + " " + title;
    }
}

public class xep_loai {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Student(input.nextLine(), Double.valueOf(input.nextLine()),
                    Double.valueOf(input.nextLine()), Double.valueOf(input.nextLine())));

        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o2, Student o1) {
                if (o1.getAvg() - o2.getAvg() > 0)
                    return 1;
                else if (o1.getAvg() - o2.getAvg() < 0)
                    return -1;
                else {
                    // return o2.getId().compareTo(o1.getId());
                    return 0;
                }
            }
        });
        for (Student o1 : arr)
            System.out.println(o1);
    }
}
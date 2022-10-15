import java.util.*;

class Student {
    private String id, name, classS;
    private double p1, p2, p3;

    public Student() {

    }

    public Student(String id, String name, String classS, double p1, double p2, double p3) {
        this.id = id;
        this.name = name;
        this.classS = classS;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classS + " " + p1 + " " + p2 + " " + p3;
    }
}

public class Bang_diem_thanh_phan_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Student> arr = new ArrayList<Student>();
        for (int i = 0; i < n; i++)
            arr.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(),
                    Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()),
                    Double.parseDouble(input.nextLine())));
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int i = 0; i < n; i++)
            System.out.println((i + 1) + " " + arr.get(i));
    }
}
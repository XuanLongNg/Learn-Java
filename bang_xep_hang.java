import java.util.*;

class Student {
    private String name;
    private int ac, submit;

    public Student() {
    }

    public Student(String name, int ac, int submit) {
        this.name = name;
        this.ac = ac;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public int getAc() {
        return ac;
    }

    public int getSubmit() {
        return submit;
    }

    @Override
    public String toString() {
        return name + " " + ac + " " + submit;
    }
}

public class bang_xep_hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine();
            String[] tmp = input.nextLine().split(" ");
            arr.add(new Student(name, Integer.valueOf(tmp[0]), Integer.valueOf(tmp[1])));
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAc() == o2.getAc()) {
                    if (o1.getSubmit() == o2.getSubmit())
                        return o1.getName().compareTo(o2.getName());
                    return o1.getSubmit() - o2.getSubmit();
                }
                return o2.getAc() - o1.getAc();
            }
        });
        for (Student i : arr)
            System.out.println(i);
    }
}
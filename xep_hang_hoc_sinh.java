import java.util.*;

class Student {
    private String id;
    private String name;
    private double gpa;
    private String appellation;
    private int ranking;

    public Student() {
        name = "NULL";
        gpa = 0;
    }

    public Student(int id, String name, double gpa) {
        this.id = "HS" + String.format("%02d", id);
        this.name = name;
        this.gpa = gpa;
        if (gpa >= 9)
            appellation = "Gioi";
        else if (gpa >= 7)
            appellation = "Kha";
        else if (gpa >= 5)
            appellation = "Trung Binh";
        else
            appellation = "Yeu";
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", gpa) + " " + appellation + " " + ranking;
    }
}

public class xep_hang_hoc_sinh {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(new Student(i + 1, input.nextLine(), Double.valueOf(input.nextLine())));
        }
        Map<Double, Integer> ranking = new TreeMap<>();
        for (Student p : students) {
            if (ranking.containsKey(1 / p.getGpa()))
                ranking.put(1 / p.getGpa(), ranking.get(1 / p.getGpa()) + 1);
            else
                ranking.put(1 / p.getGpa(), 1);
        }
        int r = 1, pre = 0;
        for (Double i : ranking.keySet()) {
            for (Student p : students) {
                if (1 / p.getGpa() == i) {
                    p.setRanking(r);
                }
            }
            // pre = ranking.get(i);
            r += ranking.get(i);
        }
        for (Student p : students)
            System.out.println(p);
    }
}
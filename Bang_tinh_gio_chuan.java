import java.util.*;

class Subject {
    private String id, name;

    public Subject() {
    }

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

class Teacher {
    private String id, name;
    private Subject subject;
    private double time;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public double getTime() {
        return time;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name + String.format("%.2f", time);
    }
}

public class Bang_tinh_gio_chuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Subject> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tmp = input.nextLine().split(" ");
            String name = "";
            for (int j = 1; j < tmp.length; j++)
                name += tmp[j] + " ";
            arr.add(new Subject(tmp[0], name));
        }
        int m = Integer.valueOf(input.nextLine());
        ArrayList<Teacher> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] tmp = input.nextLine().split(" ");
            String name = "";
            for (int j = 1; j < tmp.length; j++)
                name += tmp[j] + " ";
            list.add(new Teacher(tmp[0], name));
        }
        int k = Integer.valueOf(input.nextLine());
        for (int i = 0; i < k; i++) {
            String[] tmp = input.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                if (tmp[0].equals(list.get(j).getId())) {
                    for (int u = 0; u < n; u++) {
                        if (tmp[1].equals(arr.get(u).getId())) {
                            list.get(j).setSubject(arr.get(u));
                            list.get(j).setTime(Double.valueOf(tmp[2]) + list.get(j).getTime());
                        }
                    }
                }
            }
        }
        for (Teacher i : list)
            System.out.println(i);
    }
}
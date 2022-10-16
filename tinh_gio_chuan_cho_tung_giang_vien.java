import java.util.*;

class Subject {
    private String id, name;
    private String time;

    public Subject() {
    }

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return name + time + "\n";
    }
}

class Teacher {
    private String id, name;
    private ArrayList<Subject> subject = new ArrayList<Subject>();
    private String time;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name.trim();
    }

    public String getId() {
        return id;
    }

    public double getTime() {
        return time;
    }

    public void addSubject(Subject sub) {
        subject.add(sub);
    }

    public void setTime(String tmp) {
        time = Double.valueOf(tmp);
    }

    @Override
    public String toString() {
        String ans = "Giang vien: " + name + "\n";
        for (Subject sub : subject)
            ans += sub;
        ans += "Tong: " + String.format("%.2f", time);
        return ans;
    }
}

public class tinh_gio_chuan_cho_tung_giang_vien {
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
                            arr.get(u).setTime(Double.valueOf(tmp[2]));
                            list.get(j).addSubject(arr.get(u));
                            list.get(j).setTime(Double.valueOf(tmp[2]) + list.get(j).getTime());
                        }
                    }
                }
            }
        }
        String ans = input.nextLine();
        for (Teacher i : list)
            if (i.getId().equals(ans)) {
                System.out.println(i);
                break;
            }
    }
}
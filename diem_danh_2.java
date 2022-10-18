import java.util.*;

class Student {
    String id, name, classS, note;
    int point;

    public Student(String id, String name, String classS) {
        this.id = id;
        this.name = name;
        this.classS = classS;
        note = "";
        point = 10;
    }

    public void setPoint(char c) {
        if (c == 'm')
            point--;
        else if (c == 'v')
            point -= 2;
        if (point < 0)
            point = 0;
        if (point == 0)
            note = "KDDK";
    }

    public String getClassS() {
        return classS;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classS + " " + point + " " + note;
    }
}

public class diem_danh_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Student(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        for (int i = 0; i < n; i++) {
            String[] tmp = input.nextLine().split(" ");
            for (Student s : arr) {
                if (s.id.equals(tmp[0])) {
                    for (int j = 0; j < tmp[1].length(); j++) {
                        s.setPoint(tmp[1].charAt(j));
                    }
                }
            }
        }
        String tmp = input.nextLine();
        for (Student i : arr) {
            if (i.getClassS().equals(tmp))
                System.out.println(i);
        }
    }
}
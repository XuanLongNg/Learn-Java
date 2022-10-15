import java.util.*;

class Teacher {
    private String id, name, subject;

    public Teacher() {

    }

    public Teacher(int id, String name, String subject) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        this.subject = "";
        String[] tmp = subject.split(" ");
        for (int i = 0; i < tmp.length; i++)
            this.subject += tmp[i].toUpperCase().charAt(0);
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + subject;
    }
}

public class tim_kiem_giang_vien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Teacher> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Teacher(i + 1, input.nextLine(), input.nextLine()));
        }
        int m = Integer.valueOf(input.nextLine());
        String[] query = new String[m];
        for (int i = 0; i < m; i++) {
            query[i] = input.nextLine();
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n", query[i]);
            for (Teacher j : arr) {
                if (j.getName().toLowerCase().contains(query[i].toLowerCase()))
                    System.out.println(j);
            }
        }
    }
}
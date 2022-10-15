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
        String[] fullN = name.split(" ");
        return fullN[fullN.length - 1];
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + subject;
    }
}

public class danh_sach_giang_vien_theo_bo_mon {
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
            String[] tmp = query[i].split(" ");
            query[i] = "";
            for (int j = 0; j < tmp.length; j++)
                query[i] += tmp[j].toUpperCase().charAt(0);
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", query[i]);
            for (Teacher j : arr) {
                if (j.getSubject().equals(query[i]))
                    System.out.println(j);
            }
        }
    }
}
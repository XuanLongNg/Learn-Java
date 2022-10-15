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

    @Override
    public String toString() {
        return id + " " + name + " " + subject;
    }
}

public class sap_xep_danh_sach_giang_vien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Teacher> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Teacher(i + 1, input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int k = Math.min(o1.getName().length(), o2.getName().length());
                for (int i = 0; i < k; i++)
                    if (o1.getName().charAt(i) != o2.getName().charAt(i))
                        return (int) o1.getName().charAt(i) - (int) o2.getName().charAt(i);
                return o1.getName().length() - o2.getName().length();
            }
        });
        for (Teacher i : arr)
            System.out.println(i);
    }
}
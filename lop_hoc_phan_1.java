import java.util.*;

class Subject {
    String id, name, gr, nameTeacher;

    Subject(String id, String name, String gr, String nameTeacher) {
        this.id = id;
        this.name = name;
        this.gr = gr;
        this.nameTeacher = nameTeacher;
    }

    @Override
    public String toString() {
        return gr + " " + nameTeacher;
    }
}

public class lop_hoc_phan_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Subject> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Subject(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return Integer.valueOf(o1.gr) - Integer.valueOf(o2.gr);
            }
        });
        int m = Integer.valueOf(input.nextLine());
        for (int i = 0; i < m; i++) {
            String k = input.nextLine(), h = "";
            for (int j = 0; j < n; j++)
                if (k.equals(arr.get(j).id))
                    h = arr.get(j).name;
            System.out.printf("Danh sach nhom lop mon %s:\n", h);
            for (int j = 0; j < n; j++)
                if (k.equals(arr.get(j).id))
                    System.out.println(arr.get(j));
        }
    }
}
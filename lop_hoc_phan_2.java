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
        return id + " " + name + " " + gr;
    }
}

public class lop_hoc_phan_2 {
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
                if (o1.id.equals(o2.id))
                    return Integer.valueOf(o1.gr) - Integer.valueOf(o2.gr);
                return o1.id.compareTo(o2.id);
            }
        });
        int m = Integer.valueOf(input.nextLine());
        for (int i = 0; i < m; i++) {
            String k = input.nextLine(), h = "";
            for (int j = 0; j < n; j++)
                if (k.equals(arr.get(j).nameTeacher))
                    h = arr.get(j).nameTeacher;
            System.out.printf("Danh sach cho giang vien %s:\n", h);
            for (int j = 0; j < n; j++)
                if (k.equals(arr.get(j).nameTeacher))
                    System.out.println(arr.get(j));
        }
    }
}
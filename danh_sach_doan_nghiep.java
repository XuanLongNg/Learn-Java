import java.util.*;
import java.io.*;

class Enterprise {
    String id, name;
    int student;

    Enterprise() {
    }

    Enterprise(String id, String name, int student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + student;
    }
}

public class danh_sach_doan_nghiep {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new File("DN.in"));
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Enterprise> arr = new ArrayList<Enterprise>();
        for (int i = 0; i < n; i++) {
            arr.add(new Enterprise(input.nextLine(), input.nextLine(), Integer.valueOf(input.nextLine())));
        }
        Collections.sort(arr, new Comparator<Enterprise>() {
            @Override
            public int compare(Enterprise o1, Enterprise o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (Enterprise e : arr) {
            System.out.println(e);
        }
    }
}
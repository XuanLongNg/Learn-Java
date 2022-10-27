import java.util.*;
import java.io.*;

class Candidate {
    static int count;
    String id, name, nation, status;
    int area;
    double point, total;

    Candidate(String name, double point, String nation, int area) {
        id = String.format("TS%02d", ++count);
        name = name.trim().toLowerCase();
        String[] h = name.split("[,. @!]+");
        name = "";
        for (String i : h)
            if (i != "" && i != " ")
                name += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        this.name = name;
        this.point = point;
        total = point;
        if (!nation.equals("Kinh")) {
            total += 1.5;
        }
        if (area == 1)
            total += 1.5;
        else if (area == 2)
            total += 1;
        else
            total += 0;
        if (total >= 20.5)
            status = "Do";
        else
            status = "Truot";
    }

    double getTotal() {
        return total;
    }

    String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + total + " " + status;
    }
}

public class diem_tuyen_sinh {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("THISINH.in"));
        // Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Candidate> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Candidate(input.nextLine(), Double.valueOf(input.nextLine()), input.nextLine(),
                    Integer.valueOf(input.nextLine())));

        }
        Collections.sort(arr, new Comparator<Candidate>() {
            @Override
            public int compare(Candidate o1, Candidate o2) {
                if (o1.getTotal() > o2.getTotal())
                    return -1;
                else if (o1.getTotal() < o2.getTotal())
                    return 1;
                else {
                    return o1.getId().compareTo(o2.getId());
                }
            }
        });
        for (Candidate a : arr)
            System.out.println(a);
    }
}
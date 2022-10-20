import java.util.*;
import java.io.*;

class Candidate {
    private String id;
    private String name;
    private double math;
    private double physics;
    private double chemistry;
    private double priorityScore;
    private double total;
    private String status;

    public Candidate() {
        id = "";
        name = "";
        math = 0.0;
        physics = 0.0;
        chemistry = 0.0;
    }

    public String ch_name(String name) {
        String[] tmp = name.split("[, ?.@]+");
        name = "";
        for (String s : tmp) {
            if (s.equals("") || s.equals(" "))
                continue;
            s = s.toLowerCase();
            name += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
        }
        return name;
    }

    public Candidate(String id, String name, double math, double physics, double chemistry) {
        this.id = id;
        this.name = ch_name(name);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        if (id.charAt(2) == '1')
            priorityScore = 0.5;
        else if (id.charAt(2) == '2')
            priorityScore = 1;
        else
            priorityScore = 2.5;
        total = math * 2 + physics + chemistry + priorityScore;
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public void setStatus(Boolean status) {
        if (status)
            this.status = "TRUNG TUYEN";
        else
            this.status = "TRUOT";
    }

    @Override
    public String toString() {
        String tmpPri = "", tmpTotal = "";
        if ((int) (priorityScore) == priorityScore)
            tmpPri = String.valueOf((int) priorityScore);
        else
            tmpPri = String.valueOf(priorityScore);
        if ((int) (total) == total)
            tmpTotal = String.valueOf((int) total);
        else
            tmpTotal = String.valueOf(total);
        return id + " " + name + tmpPri + " " + tmpTotal + " " + status;
    }
}

public class danh_sach_trung_tuyen {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("THISINH.in"));
        // Scanner input = new Scanner(System.in);

        int n = Integer.valueOf(input.nextLine());
        ArrayList<Candidate> arr = new ArrayList<Candidate>();
        for (int i = 0; i < n; i++) {
            Candidate a = new Candidate(input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Double.valueOf(input.nextLine()), Double.valueOf(input.nextLine()));
            arr.add(a);
        }
        int m = Integer.valueOf(input.nextLine());
        Collections.sort(arr, new Comparator<Candidate>() {
            @Override
            public int compare(Candidate o2, Candidate o1) {
                if (o1.getTotal() > o2.getTotal())
                    return 1;
                else if (o1.getTotal() < o2.getTotal())
                    return -1;
                else {
                    return o2.getId().compareTo(o1.getId());
                }
            }
        });
        double diem = 0;
        for (int i = 0; i < n; i++) {
            if (i < m) {
                diem = arr.get(i).getTotal();
                arr.get(i).setStatus(true);
            } else {
                if (arr.get(i).getTotal() == diem)
                    arr.get(i).setStatus(true);
                else
                    arr.get(i).setStatus(false);
                // System.out.println(arr.get(i).getTotal() + " " + diem);
            }
        }
        System.out.printf("%.1f\n", diem);
        for (Candidate a : arr)
            System.out.println(a);
    }
}
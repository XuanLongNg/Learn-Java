import java.util.*;

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

    public void chuan_hoa(String name) {
        String[] tmp = name.split(" ");
        name = "";
        for (String s : tmp) {
            s = s.toLowerCase();
            name += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
        }
        this.name = name;
    }

    public Candidate(String id, String name, double math, double physics, double chemistry) {
        this.id = id;
        chuan_hoa(name);
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
        if (total >= 24)
            status = "TRUNG TUYEN";
        else
            status = "TRUOT";
    }

    public double getTotal() {
        return total;
    }

    public String getId() {
        return id;
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

public class sap_xep_ket_qua_tuyen_sinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Candidate> arr = new ArrayList<Candidate>();
        for (int i = 0; i < n; i++) {
            Candidate a = new Candidate(input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Double.valueOf(input.nextLine()), Double.valueOf(input.nextLine()));
            arr.add(a);
        }
        Collections.sort(arr, new Comparator<Candidate>() {
            @Override
            public int compare(Candidate o1, Candidate o2) {
                if (o1.getTotal() == o2.getTotal())
                    return o1.getId().compareTo(o2.getId());
                if (o1.getTotal() - o2.getTotal() > 0)
                    return -1;
                return 1;
            }
        });
        for (Candidate a : arr)
            System.out.println(a);
    }
}
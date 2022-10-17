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

    public Candidate(String id, String name, double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        if (id.charAt(2) == '1')
            priorityScore = 0.5;
        else if (id.charAt(2) == '2')
            priorityScore = 1;
        else
            priorityScore = 2.5;
        total = math * 2 + physics + chemistry;
        if (total + priorityScore >= 24)
            status = "TRUNG TUYEN";
        else
            status = "TRUOT";
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
        return id + " " + name + " " + tmpPri + " " + tmpTotal + " " + status;
    }
}

public class bang_diem_tuyen_sinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Candidate> arr = new ArrayList<Candidate>();
        for (int i = 0; i < n; i++) {
            Candidate a = new Candidate(input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Double.valueOf(input.nextLine()), Double.valueOf(input.nextLine()));
            arr.add(a);
        }
        for (Candidate a : arr)
            System.out.println(a);
    }
}
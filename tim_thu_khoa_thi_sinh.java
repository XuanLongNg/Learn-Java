import java.util.*;

class Thi_sinh {
    private int ID;
    private String name;
    private String date;
    private double sub1;
    private double sub2;
    private double sub3;
    private double total;

    public Thi_sinh() {
        ID = 0;
        name = "NULL";
        date = "NULL";
        sub1 = 0;
        sub2 = 0;
        sub3 = 0;
        total = 0;
    }

    public Thi_sinh(int ID, String name, String date, double sub1, double sub2, double sub3) {
        this.ID = ID;
        this.name = name;
        this.date = date;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        total = sub1 + sub2 + sub3;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + date + " " + total;
    }
}

public class tim_thu_khoa_thi_sinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String tmp = input.nextLine();
        ArrayList<Thi_sinh> list = new ArrayList<Thi_sinh>();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine(), date = input.nextLine(), sub1 = input.nextLine(), sub2 = input.nextLine(),
                    sub3 = input.nextLine();
            list.add(new Thi_sinh(i + 1, name, date, Double.valueOf(sub1), Double.valueOf(sub2), Double.valueOf(sub3)));
        }
        double Max = 0;
        for (Thi_sinh i : list) {
            Max = Math.max(Max, i.getTotal());
        }
        for (Thi_sinh i : list) {
            if (i.getTotal() == Max)
                System.out.println(i);
        }
    }
}

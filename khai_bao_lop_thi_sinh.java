import java.util.*;

class Thi_sinh {
    private String name;
    private String date;
    private double sub1;
    private double sub2;
    private double sub3;
    private double total;

    public Thi_sinh() {
        name = "NULL";
        date = "NULL";
        sub1 = 0;
        sub2 = 0;
        sub3 = 0;
        total = 0;
    }

    public Thi_sinh(String name, String date, double sub1, double sub2, double sub3) {
        this.name = name;
        this.date = date;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        total = sub1 + sub2 + sub3;
    }

    @Override
    public String toString() {
        return name + " " + date + " " + total;
    }
}

public class khai_bao_lop_thi_sinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(), date = input.nextLine();
        double sub1 = input.nextDouble(), sub2 = input.nextDouble(), sub3 = input.nextDouble();
        Thi_sinh obj1 = new Thi_sinh(name, date, sub1, sub2, sub3);
        System.out.println(obj1);
    }
}

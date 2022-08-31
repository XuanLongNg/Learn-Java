import java.util.*;

class Sinh_vien {
    private String ID;
    private String name;
    private String Class;
    private String date;
    private double GPA;

    public Sinh_vien() {
        ID = "";
        name = "";
        date = "";
        Class = "";
        GPA = 0;
    }

    public String chuan_hoa(String date) {
        String ans = "", tmp = "";
        if (date.charAt(2) != '/')
            ans += "0" + date;
        if (ans.charAt(5) != '/') {
            tmp += ans.substring(0, 3) + "0" + ans.substring(3, ans.length());
            ans = tmp;
        }
        return ans;
    }

    public Sinh_vien(String name, String Class, String date, double GPA) {
        ID = "B20DCCN001";
        this.name = name;
        this.Class = Class;
        this.date = chuan_hoa(date);
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + Class + " " + date + " " + String.format("%.2f", GPA);
    }
}

public class khai_bao_lop_sinh_vien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(), Class = input.nextLine(), date = input.nextLine();
        double GPA = input.nextDouble();
        Sinh_vien obj1 = new Sinh_vien(name, Class, date, GPA);
        System.out.println(obj1);
    }
}

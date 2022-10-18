import java.util.*;
import java.util.*;

class Teacher {
    private String ID;
    private String Name;
    private String BasicSalary;
    private String Allowance;
    private String Position;
    private int BaseNumber;
    private String Income;

    public Teacher() {
        ID = "";
        Name = "";
        BasicSalary = "";
        Allowance = "";
    }

    public Teacher(String ID, String Name, String BasicSalary) {
        this.ID = ID;
        this.Name = Name;
        this.BasicSalary = BasicSalary;
        Position = ID.substring(0, 2);
        BaseNumber = Integer.parseInt(ID.substring(2, ID.length()));
        if (Position.equals("HT"))
            Allowance = "2000000";
        else if (Position.equals("HP"))
            Allowance = "900000";
        else
            Allowance = "500000";
        Income = String.valueOf(Integer.valueOf(BasicSalary) * BaseNumber + Integer.valueOf(Allowance));
    }

    @Override
    public String toString() {
        return ID + " " + Name + " " + String.valueOf(BaseNumber) + " " + Allowance + " " + Income;
    }
}

public class bang_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Teacher> arr = new ArrayList<>();
        int demht = 0, demhp = 0;
        for (int i = 0; i < n; i++) {
            String id = input.nextLine(), name = input.nextLine(), baseSalary = input.nextLine();
            if (id.substring(0, 2).equals("HT")) {

                demht++;
                if (demht > 1)
                    continue;
            } else if (id.substring(0, 2).equals("HP")) {

                demhp++;
                if (demhp > 2)
                    continue;
            }
            arr.add(new Teacher(id, name, baseSalary));
        }
        for (Teacher t : arr) {
            System.out.println(t);
        }
    }
}
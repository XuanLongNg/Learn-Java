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

public class tinh_thu_thap_giao_vien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ID = input.nextLine(), Name = input.nextLine(), BasicSalary = input.nextLine();
        Teacher obj1 = new Teacher(ID, Name, BasicSalary);
        System.out.println(obj1);
    }
}

import java.util.*;

class Employee {
    private String ID;
    private String name;
    private long salary;
    private long baseSalary;
    private long reward;
    private int dayOfMonth;
    private String position;
    private long allowance;
    private long totalSalary;

    public Employee() {
        ID = "";
        name = "";
        salary = 0;
        baseSalary = 0;
        reward = 0;
        dayOfMonth = 0;
        position = "";
        allowance = 0;
        totalSalary = 0;
    }

    public Employee(int id, String name, long baseSalary, int dayOfMonth, String position) {
        String tmp = "NV";
        if (id < 10)
            tmp += "0";
        tmp += String.valueOf(id);
        ID = tmp;
        this.name = name;
        this.baseSalary = baseSalary;
        this.dayOfMonth = dayOfMonth;
        this.position = position;
        salary = dayOfMonth * baseSalary;
        if (dayOfMonth >= 25)
            reward = salary * 2 / 10;
        else if (dayOfMonth < 22)
            reward = 0;
        else
            reward = salary / 10;
        if (position.equals("GD"))
            allowance = 250000;
        else if (position.equals("PGD"))
            allowance = 200000;
        else if (position.equals("TP"))
            allowance = 180000;
        else
            allowance = 150000;
        totalSalary = salary + reward + allowance;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + salary + " " + reward + " " + allowance + " " + totalSalary;
    }
}

public class bai_toan_tinh_cong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(), baseSalary = input.nextLine(), date = input.nextLine(),
                position = input.nextLine();
        Employee employee = new Employee(1, name, Long.valueOf(baseSalary), Integer.valueOf(date), position);
        System.out.println(employee);
    }

}

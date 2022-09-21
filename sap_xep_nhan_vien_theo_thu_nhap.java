import java.util.*;

class Employee {
    private String ID;
    private String name;
    private int salary;
    private int baseSalary;
    private int dayOfMonth;
    private String position;
    private int allowance;
    private int totalSalary;
    private int tempSalary;
    private int debtSalary;

    public Employee() {
        ID = "";
        name = "";
        salary = 0;
        baseSalary = 0;
        tempSalary = 0;
        dayOfMonth = 0;
        position = "";
        allowance = 0;
        totalSalary = 0;
    }

    public Employee(int id, String name, String position, int baseSalary, int dayOfMonth) {
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
        if (position.equals("GD"))
            allowance = 500;
        else if (position.equals("PGD"))
            allowance = 400;
        else if (position.equals("TP"))
            allowance = 300;
        else if (position.equals("KT"))
            allowance = 250;
        else
            allowance = 100;
        totalSalary = salary + allowance;
        if ((allowance + salary) * 2 / 3 < 25000) {
            tempSalary = (allowance + salary) * 2 / 3;
            int tmpSlr = tempSalary % 1000;
            if (tmpSlr >= 500)
                tempSalary = tempSalary / 1000 * 1000 + 1000;
            else
                tempSalary = tempSalary / 1000 * 1000;
        } else
            tempSalary = 25000;
        debtSalary = totalSalary - tempSalary;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + allowance + " " + salary + " " + tempSalary + " " + debtSalary;
    }
}

public class sap_xep_nhan_vien_theo_thu_nhap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String tmp = input.nextLine();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine(), position = input.nextLine(), baseSalary = input.nextLine(),
                    date = input.nextLine();
            employees.add(new Employee(i + 1, name, position, Integer.valueOf(baseSalary), Integer.valueOf(date)));
        }
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getTotalSalary() - o1.getTotalSalary();
            }
        });
        for (Employee i : employees)
            System.out.println(i);
    }
}

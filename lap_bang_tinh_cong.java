import java.util.*;

class Employee {
    private static int count = 1;
    private String id, name, position;
    private int reward, allowance, pracSalary, dailySalary, monthlySalary, NOW;

    public Employee() {

    }

    public Employee(String name, int dailySalary, int NOW, String position) {
        id = "NV" + String.format("%02d", count++);
        this.name = name;
        this.dailySalary = dailySalary;
        this.NOW = NOW;
        this.position = position;
        monthlySalary = dailySalary * NOW;
        if (NOW >= 25)
            reward = monthlySalary * 2 / 10;
        else if (NOW >= 22)
            reward = monthlySalary / 10;
        else
            reward = 0;
        if (position.equals("GD"))
            allowance = 250000;
        else if (position.equals("PGD"))
            allowance = 200000;
        else if (position.equals("TP"))
            allowance = 180000;
        else
            allowance = 150000;
        pracSalary = monthlySalary + reward + allowance;
    }

    public int getPracSalary() {
        return pracSalary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", id, name, monthlySalary, reward, allowance, pracSalary);
    }
}

public class lap_bang_tinh_cong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Employee> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Employee(input.nextLine(), Integer.valueOf(input.nextLine()),
                    Integer.valueOf(input.nextLine()), input.nextLine()));
        }
        for (Employee i : arr) {
            System.out.println(i);
        }
    }
}
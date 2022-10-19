import java.util.*;

class Department {
    String id, name;

    Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    String getId() {
        return id;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Employee {
    String id, name;
    Department department;
    int DOW, basicSalary, monthlySalary, base;

    Employee() {
    }

    Employee(String id, String name, int basicSalary, int DOW) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.DOW = DOW;
        int age = Integer.valueOf(id.substring(1, 3));
        if (id.charAt(0) == 'A') {
            if (age < 4)
                base = 10;
            else if (age < 9)
                base = 12;
            else if (age < 16)
                base = 14;
            else
                base = 20;
        } else if (id.charAt(0) == 'B') {
            if (age < 4)
                base = 10;
            else if (age < 9)
                base = 11;
            else if (age < 16)
                base = 13;
            else
                base = 16;
        } else if (id.charAt(0) == 'C') {
            if (age < 4)
                base = 9;
            else if (age < 9)
                base = 10;
            else if (age < 16)
                base = 12;
            else
                base = 14;
        } else {
            if (age < 4)
                base = 8;
            else if (age < 9)
                base = 9;
            else if (age < 16)
                base = 11;
            else
                base = 13;
        }
        monthlySalary = base * basicSalary * DOW * 1000;
    }

    void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + monthlySalary;
    }
}

public class bang_luong_theo_phong_ban {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Department> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tmp = input.nextLine().split(" ");
            String name = "";
            for (int j = 1; j < tmp.length; j++)
                name += tmp[j] + " ";
            name = name.substring(0, name.length() - 1);
            arr.add(new Department(tmp[0], name));
        }
        ArrayList<Employee> list = new ArrayList<>();
        int m = Integer.valueOf(input.nextLine());
        for (int i = 0; i < m; i++) {
            list.add(new Employee(input.nextLine(), input.nextLine(), Integer.valueOf(input.nextLine()),
                    Integer.valueOf(input.nextLine())));
        }
        String k = input.nextLine(), h = "";
        for (int i = 0; i < n; i++) {
            if (arr.get(i).id.equals(k))
                h = arr.get(i).getName();
            for (int j = 0; j < m; j++)
                if (arr.get(i).id.equals(list.get(j).id.substring(3))) {
                    list.get(j).setDepartment(arr.get(i));
                }
        }
        System.out.printf("Bang luong phong %s:\n", h);
        for (Employee i : list)
            if (i.id.substring(3).equals(k))
                System.out.println(i);
    }
}
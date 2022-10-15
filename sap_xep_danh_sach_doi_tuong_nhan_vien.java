import java.util.*;

class Employee {
    private String ID;
    private String name;
    private String sex;
    private String date;
    private String address;
    private String code;
    private String startdate;

    public Employee() {
        ID = "";
        name = "";
        sex = "";
        date = "";
        address = "";
        code = "";
        startdate = "";
    }

    public Employee(int id, String name, String sex, String date, String address, String code, String startdate) {
        String tmp = "";
        while ((tmp + String.valueOf(id)).length() < 5)
            tmp += "0";
        tmp += String.valueOf(id);
        ID = tmp;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
        this.code = code;
        this.startdate = startdate;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + sex + " " + date + " " + address + " " + code + " " + startdate;
    }
}

public class sap_xep_danh_sach_doi_tuong_nhan_vien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String tmp = input.nextLine();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < n; i++) {
            employees.add(new Employee(i + 1, input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(),
                    input.nextLine(), input.nextLine()));
        }
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                String[] a1 = o1.getDate().split("/"), a2 = o2.getDate().split("/");
                if (a1[2].equals(a2[2]) == false)
                    return Integer.valueOf(a1[2]) - Integer.valueOf(a2[2]);
                else if (a1[1].equals(a2[1]) == false)
                    return Integer.valueOf(a1[1]) - Integer.valueOf(a2[1]);
                return Integer.valueOf(a1[0]) - Integer.valueOf(a2[0]);
            }
        });
        for (Employee i : employees)
            System.out.println(i);
    }
}

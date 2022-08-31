import java.util.*;

class Employee {
    private String ID;
    private String name;
    private String sex;
    private String date;
    private String address;
    private String Zip;
    private String date_contract;

    public Employee() {
        ID = "";
        name = "";
        sex = "";
        date = "";
        address = "";
        Zip = "";
        date_contract = "";
    }

    public String chuan_hoa(String date) {
        String ans = "", tmp = "";
        ans = date;
        if (date.charAt(2) != '/')
            ans = "0" + date;
        if (ans.charAt(5) != '/') {
            tmp += ans.substring(0, 3) + "0" + ans.substring(3, ans.length());
            ans = tmp;
        }
        return ans;
    }

    public Employee(String name, String sex, String date, String address, String Zip, String date_contract) {
        ID = "00001";
        this.name = name;
        this.sex = sex;
        this.date = chuan_hoa(date);
        this.address = address;
        this.Zip = Zip;
        this.date_contract = chuan_hoa(date_contract);
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + sex + " " + date + " " + address + " " + Zip + " " + date_contract;
    }
}

public class khai_bao_lop_nhan_vien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine(),
                sex = input.nextLine(),
                date = input.nextLine(),
                address = input.nextLine(),
                Zip = input.nextLine(),
                date_contract = input.nextLine();
        Employee a = new Employee(name, sex, date, address, Zip, date_contract);
        System.out.println(a);
    }
}

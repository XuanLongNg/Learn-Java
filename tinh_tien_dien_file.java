import java.util.*;
import java.io.*;

class Customer {
    static int count;
    String id, name, kindOf;
    int old, new1, total, tmp, price, price1, vat, totalMoney;

    Customer(String name, String kindOf, int old, int new1) {
        id = String.format("KH%02d", ++count);
        name = name.trim().toLowerCase();
        String[] h = name.split("[,. @!]+");
        name = "";
        for (String i : h)
            if (i != "" && i != " ")
                name += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        this.name = name;
        this.new1 = new1;
        this.old = old;
        total = new1 - old;
        if (kindOf.equals("A"))
            tmp = 100;
        else if (kindOf.equals("B"))
            tmp = 500;
        else if (kindOf.equals("C"))
            tmp = 200;
        if (total <= tmp) {
            price = total * 450;
            price1 = 0;
        } else {
            price = tmp * 450;
            price1 = (total - tmp) * 1000;
        }
        vat = price1 * 5 / 100;
        totalMoney = price + price1 + vat;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    @Override
    public String toString() {
        return id + " " + name + price + " " + price1 + " " + vat + " " + totalMoney;
        // return id + " " + name + price + " " + price1 + " " + totalMoney;
        // return id + " " + price + " " + price1 + " " + vat + " " + totalMoney;
    }
}

public class tinh_tien_dien_file {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("KHACHHANG.in"));
        // Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine(), tmp = input.nextLine();
            String[] tmp1 = tmp.split(" ");
            arr.add(new Customer(name, tmp1[0], Integer.valueOf(tmp1[1]), Integer.valueOf(tmp1[2])));
        }
        Collections.sort(arr, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o2.getTotalMoney() - o1.getTotalMoney();
            }
        });
        for (Customer c : arr) {
            System.out.println(c);
        }
    }
}

import java.util.*;

class Customer {
    static int count;
    String id, name, gender, date, address;

    Customer(String name, String gender, String date, String address) {
        id = "KH" + String.format("%03d", ++count);
        name = name.toLowerCase().trim();
        String[] tmp = name.split("[, ?.@]+");
        name = "";
        for (int i = 0; i < tmp.length; i++) {
            name += tmp[i].substring(0, 1).toUpperCase() + tmp[i].substring(1) + " ";
        }
        this.name = name;
        this.gender = gender;
        if (date.charAt(2) != '/')
            date = "0" + date;
        if (date.charAt(5) != '/')
            date = date.substring(0, 3) + "0" + date.substring(3);
        this.date = date;
        this.address = address;
    }

    @Override
    public String toString() {
        return id + " " + name + gender + " " + address + " " + date;
    }
}

public class danh_sach_khach_hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Customer(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.date.substring(6).equals(o2.date.substring(6)) == false)
                    return o1.date.substring(6).compareTo(o2.date.substring(6));
                else if (o1.date.substring(3, 5).equals(o2.date.substring(3, 5)) == false)
                    return o1.date.substring(3, 5).compareTo(o2.date.substring(3, 5));
                return o1.date.substring(0, 2).compareTo(o2.date.substring(0, 2));

            }
        });
        for (Customer i : arr)
            System.out.println(i);
    }
}
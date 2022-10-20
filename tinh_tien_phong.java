import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Customer {
    static int count;
    String id, name;
    LocalDate start, end;
    int serCost, price, idRoom;
    long day, intoMoney;

    String chuan_hoa(String tmp) {
        if (tmp.charAt(2) != '/')
            tmp = "0" + tmp;
        if (tmp.charAt(5) != '/')
            tmp = tmp.substring(0, 3) + "0" + tmp.substring(3);
        return tmp.substring(0, 10);
    }

    String ch_name(String name) {
        String[] tmp = name.split("[, ?.@]+");
        name = "";
        for (String s : tmp) {
            if (s.equals("") || s.equals(" "))
                continue;
            s = s.toLowerCase();
            name += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
        }
        return name;
    }

    Customer(String name, int idRoom, String start, String end, int serCost) {
        id = "KH" + String.format("%02d", ++count);
        name = ch_name(name);
        this.name = name;
        this.idRoom = idRoom;
        DateTimeFormatter k = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        start = chuan_hoa(start);
        end = chuan_hoa(end);
        this.start = LocalDate.parse(start, k);
        this.end = LocalDate.parse(end, k);
        this.serCost = serCost;
        int tmp = idRoom / 100;
        if (tmp == 1)
            price = 25;
        else if (tmp == 2)
            price = 34;
        else if (tmp == 3)
            price = 50;
        else
            price = 80;
        day = java.time.temporal.ChronoUnit.DAYS.between(this.start, this.end) + 1;
        // day = 1;
        intoMoney = day * price + serCost;
    }

    @Override
    public String toString() {
        return id + " " + name + idRoom + " " + day + " " + intoMoney;
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("KHACHHANG.in"));
        // Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Customer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.nextLine();
            arr.add(new Customer(input.nextLine(), input.nextInt(), input.next(), input.next(), input.nextInt()));
        }
        Collections.sort(arr, new Comparator<Customer>() {
            @Override
            public int compare(Customer c2, Customer c1) {
                if (c1.intoMoney > c2.intoMoney)
                    return 1;
                else if (c1.intoMoney < c2.intoMoney)
                    return -1;
                return 0;
            }
        });
        for (Customer c : arr) {
            System.out.println(c);
        }
    }
}
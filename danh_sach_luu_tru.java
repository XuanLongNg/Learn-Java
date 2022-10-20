import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Customer {
    static int count;
    String id, name, idRoom;
    LocalDate startDate, endDate;
    long day;

    Customer(String name, String idRoom, LocalDate startDate, LocalDate endDate) {
        count++;
        id = "KH" + String.format("%02d", count);
        this.name = name;
        this.idRoom = idRoom;
        this.startDate = startDate;
        this.endDate = endDate;
        day = java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + idRoom + " " + day;
    }
}

public class danh_sach_luu_tru {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("KHACH.in"));
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine(), id = input.nextLine(), st = input.nextLine(), end = input.nextLine();

            DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            arr.add(new Customer(name, id, LocalDate.parse(st, form),
                    LocalDate.parse(end, form)));
        }
        Collections.sort(arr, new Comparator<Customer>() {
            @Override
            public int compare(Customer o2, Customer o1) {
                if (o1.day - o2.day < 0)
                    return -1;
                else if (o1.day - o2.day > 0)
                    return 1;
                return 0;
            }
        });
        for (Customer c : arr) {
            System.out.println(c);
        }
    }
}
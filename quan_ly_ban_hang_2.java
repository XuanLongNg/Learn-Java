import java.util.*;

class Customer {
    private static int count;
    private String id, name, gender, dob, address;

    public Customer() {

    }

    public Customer(String name, String gender, String dob, String address) {
        count++;
        id = "KH" + String.format("%03d", count);
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " " + address;
    }
}

class Product {
    private static int count;

    private String id, name, unit;

    private long importPrice, price, totalPrice, quantity, profit;

    public Product() {

    }

    public Product(String name, String unit, long importPrice, long price) {
        count++;
        id = "MH" + String.format("%03d", count);
        this.name = name;
        this.unit = unit;
        this.importPrice = importPrice;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public long getImportPrice() {
        return importPrice;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Bill {
    private static int count;
    private String id;
    private Customer customer;
    private Product product;
    private long quantity, profit, totalPrice;

    public Bill(Customer customer, Product product, long quantity) {
        count++;
        id = "HD" + String.format("%03d", count);
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        totalPrice = quantity * product.getPrice();
        profit = totalPrice - quantity * product.getImportPrice();
    }

    public long getProfit() {
        return profit;
    }

    public Product getProduct() {
        return product;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + customer + " " + product + " " + quantity + " " + totalPrice + " " + profit;
    }
}

public class quan_ly_ban_hang_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nCus = Integer.valueOf(input.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        for (int i = 0; i < nCus; i++) {
            arr.add(new Customer(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int nProduct = Integer.valueOf(input.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < nProduct; i++) {
            products.add(new Product(input.nextLine(), input.nextLine(), Long.valueOf(input.nextLine()),
                    Long.valueOf(input.nextLine())));
        }
        int nBill = Integer.valueOf(input.nextLine());
        ArrayList<Bill> listBill = new ArrayList<>();
        for (int i = 0; i < nBill; i++) {
            String[] tmp = input.nextLine().split(" ");
            Customer tmpCus = arr.get(0);
            for (int j = 0; j < nCus; j++)
                if (arr.get(j).getId().equals(tmp[0])) {
                    tmpCus = arr.get(j);
                    break;
                }
            Product tmpPro = products.get(0);
            for (int j = 0; j < nProduct; j++)
                if (products.get(j).getId().equals(tmp[1])) {
                    tmpPro = products.get(j);
                    break;
                }
            listBill.add(new Bill(tmpCus, tmpPro, Long.valueOf(tmp[2])));
            // System.out.println(listBill.get(i));
        }
        Collections.sort(listBill, new Comparator<Bill>() {
            @Override
            public int compare(Bill o1, Bill o2) {
                if (o1.getProfit() == o2.getProfit()) {
                    return o1.getId().compareTo(o2.getId());
                } else if (o1.getProfit() < o2.getProfit())
                    return 1;
                return -1;
            }
        });
        for (Bill i : listBill)
            System.out.println(i);
    }
}
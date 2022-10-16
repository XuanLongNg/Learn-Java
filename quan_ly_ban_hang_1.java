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

    private long importPrice, price, totalPrice, quantity;

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

    public void addQuantity(long quantity) {
        this.quantity = quantity;
        totalPrice = quantity * (price);
    }

    @Override
    public String toString() {
        return name + " " + unit + " " + importPrice + " " + price + " " + quantity + " " + totalPrice;
    }
}

class Bill {
    private static int count;
    private String id;
    private Customer customer;
    private Product product;

    public Bill(Customer customer, Product product, long quantity) {
        count++;
        id = "HD" + String.format("%03d", count);
        this.customer = customer;
        this.product = product;
        product.addQuantity(quantity);
    }

    @Override
    public String toString() {
        return id + " " + customer + " " + product;
    }
}

public class quan_ly_ban_hang_1 {
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
            Customer tmpCus = new Customer();
            for (Customer j : arr)
                if (j.getId().equals(tmp[0])) {
                    tmpCus = j;
                    break;
                }
            Product tmpPro = new Product();
            for (Product j : products)
                if (j.getId().equals(tmp[1])) {
                    tmpPro = j;
                    break;
                }
            listBill.add(new Bill(tmpCus, tmpPro, Long.valueOf(tmp[2])));
            System.out.println(listBill.get(i));

        }
    }
}
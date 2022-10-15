import java.util.*;

class Product {
    private static int count;
    private String id, name, unit;
    private double deliExpenses, intoMoney, importPrice, price;
    private int quantity;

    public Product() {

    }

    public Product(String name, String unit, double importPrice, int quantity) {
        count++;
        id = "MH" + String.format("%02d", count);
        this.name = name;
        this.unit = unit;
        this.importPrice = importPrice;
        this.quantity = quantity;
        deliExpenses = Math.round(importPrice * quantity * 0.05);
        intoMoney = Math.round(importPrice * quantity + deliExpenses);
        price = (intoMoney + intoMoney * 0.02) / quantity;
        price = Math.ceil(price / 100) * 100;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %.0f %.0f", id, name, unit, deliExpenses, intoMoney, price);
    }
}

public class tinh_gia_ban_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Product(input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Integer.valueOf(input.nextLine())));
        }
        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o2, Product o1) {
                if (o1.getPrice() - o2.getPrice() > 0)
                    return 1;
                else if (o1.getPrice() - o2.getPrice() < 0)
                    return -1;
                return 0;
            }
        });
        for (Product i : arr)
            System.out.println(i);
    }
}
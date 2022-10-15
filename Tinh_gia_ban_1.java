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
        price = intoMoney + intoMoney * 0.02;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.0f %.0f %.0f", id, name, unit, deliExpenses, intoMoney, price);
    }
}

public class Tinh_gia_ban_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Product(input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Integer.valueOf(input.nextLine())));
        }
        for (Product i : arr)
            System.out.println(i);
    }
}
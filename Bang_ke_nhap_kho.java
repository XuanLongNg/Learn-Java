import java.util.*;

class Product {
    private String ID;
    private String name;
    private int quantity;
    private long price;
    private long discount;
    private long discountMoney;
    private long total;

    public Product(int id, String name, int quantity, long price) {
        String[] tmp = name.split(" ");
        String temp = "";
        temp += tmp[0].charAt(0);
        temp += tmp[1].toUpperCase().charAt(0);
        if (id < 10)
            temp += "0";
        temp += String.valueOf(id);
        ID = temp;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        if (quantity > 10)
            discount = 5;
        else if (quantity <= 10 && quantity >= 8)
            discount = 2;
        else if (quantity < 8 && quantity >= 5)
            discount = 1;
        else if (quantity < 5)
            discount = 0;
        discountMoney = price * quantity * discount;
        discountMoney /= 100;
        total = price * quantity - discountMoney;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + discountMoney + " " + total;
    }
}

public class Bang_ke_nhap_kho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String tmp = input.nextLine();
        ArrayList<Product> products = new ArrayList<Product>();
        Map<String, Integer> count = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine(), quantity = input.nextLine(), price = input.nextLine(), temp = "";
            String[] temps = name.split(" ");
            temp += temps[0].charAt(0) + temps[1].charAt(0);
            if (count.containsKey(temp))
                count.put(temp, count.get(temp) + 1);
            else
                count.put(temp, 1);
            products.add(new Product(count.get(temp), name, Integer.valueOf(quantity), Long.valueOf(price)));
        }
        for (Product i : products)
            System.out.println(i);
    }
}

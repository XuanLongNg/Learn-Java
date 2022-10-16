import java.util.*;

class Product {
    private String ID;
    private String name;
    private int quantity;
    private long price;
    private int discount;
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
        else if (quantity >= 8)
            discount = 2;
        else if (quantity >= 5)
            discount = 1;
        else
            discount = 0;
        discountMoney = price * quantity * discount;
        discountMoney /= 100;
        total = price * quantity - discountMoney;
    }

    public long getDiscountMoney() {
        return discountMoney;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + discountMoney + " " + total;
    }
}

public class bang_ke_nhap_kho_sap_xep_theo_chiet_khau {
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
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getDiscountMoney() - o2.getDiscountMoney() > 0)
                    return -1;
                else if (o1.getDiscountMoney() - o2.getDiscountMoney() < 0)
                    return 1;
                return 0;
            }
        });
        for (Product i : products)
            System.out.println(i);
    }
}

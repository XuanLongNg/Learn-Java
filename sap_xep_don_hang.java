import java.util.*;

class Product {
    private String id, name, index, kindOf;
    private int price, quantity, discount, intoMoney;

    public Product(String name, String id, int price, int quantity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        index = id.substring(1, 4);
        if (id.charAt(4) == '2')
            discount = price * quantity / 100 * 30;
        else
            discount = price * quantity / 100 * 50;
        intoMoney = price * quantity - discount;
    }

    public int getIndex() {
        return Integer.valueOf(index);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", name, id, index, discount, intoMoney);
    }
}

public class sap_xep_don_hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Product(input.nextLine(), input.nextLine(), Integer.valueOf(input.nextLine()),
                    Integer.valueOf(input.nextLine())));

        }
        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getIndex() - o2.getIndex();
            }
        });
        for (Product i : arr)
            System.out.println(i);
    }
}
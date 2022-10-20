import java.util.*;

class Product {
    String id, name;
    int price, warranty;

    Product(String id, String name, int price, int warranty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + warranty;
    }
}

public class danh_sach_san_phan_2 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner input = new Scanner(new File("SANPHAM.in"));
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Product(input.nextLine(), input.nextLine(), Integer.valueOf(input.nextLine()),
                    Integer.valueOf(input.nextLine())));

        }
        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.price == o2.price) {
                    return o1.id.compareTo(o2.id);
                }
                return o2.price - o1.price;
            }
        });
        for (Product o : arr)
            System.out.println(o);
    }
}
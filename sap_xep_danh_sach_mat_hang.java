import java.util.*;

class Product {
    private int id;
    private String name;
    private String productLine;
    private double inPrice;
    private double outPrice;
    private double profit;

    public Product() {

    }

    public Product(int id, String name, String productLine, double inPrice, double outPrice) {
        this.id = id;
        this.name = name;
        this.productLine = productLine;
        this.inPrice = inPrice;
        this.outPrice = outPrice;
        profit = outPrice - inPrice;
    }

    public double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + productLine + " " + String.format("%.2f", profit);
    }
}

public class sap_xep_danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            products.add(new Product(i + 1, input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Double.valueOf(input.nextLine())));
        }
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getProfit() - o2.getProfit() < 0)
                    return 1;
                else if (o1.getProfit() - o2.getProfit() > 0)
                    return -1;
                return 0;
            }
        });
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

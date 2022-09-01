import java.util.*;

class Product {
    private String ID;
    private String name;
    private String unit;
    private int iPrice;
    private int oPrice;
    private int profit;

    public Product() {
        ID = "";
        name = "";
        unit = "";
        iPrice = 0;
        oPrice = 0;
    }

    public Product(int id, String name, String unit, int iPrice, int oPrice) {
        ID = "MH";
        int i = String.valueOf(id).length();
        while (i < 3) {
            i++;
            ID += "0";
        }
        ID += String.valueOf(id);
        this.name = name;
        this.unit = unit;
        this.iPrice = iPrice;
        this.oPrice = oPrice;
        profit = oPrice - iPrice;
    }

    public int getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + unit + " " + iPrice + " " + oPrice + " " + profit;
    }
}

public class danh_sach_mat_hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String tmp = input.nextLine();
        List<Product> products = new ArrayList<Product>();
        for (int i = 0; i < n; i++) {
            products.add(new Product(i + 1, input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()),
                    Integer.parseInt(input.nextLine())));
        }
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getProfit() - o1.getProfit();
            }
        });
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

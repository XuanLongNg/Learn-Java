import java.util.*;
import java.io.*;

class Product {
    private String ID;
    private String name;
    private String unit;
    private double iPrice;
    private double oPrice;
    private double profit;

    public Product() {
        ID = "";
        name = "";
        unit = "";
        iPrice = 0;
        oPrice = 0;
    }

    public Product(int id, String name, String unit, double iPrice, double oPrice) {
        ID = "MH";
        int i = String.valueOf(id).length();
        while (i < 2) {
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

    public double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + unit + " " + String.format("%.2f", profit);
    }
}

public class sap_xep_mat_hang {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner input = new Scanner(new File("MATHANG.in"));
        // Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String tmp = input.nextLine();
        List<Product> products = new ArrayList<Product>();
        for (int i = 0; i < n; i++) {
            products.add(new Product(i + 1, input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Double.valueOf(input.nextLine())));
        }
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o2, Product o1) {
                if (o2.getProfit() - o1.getProfit() > 0)
                    return -1;
                else if (o2.getProfit() - o1.getProfit() < 0)
                    return 1;
                return 0;
            }
        });
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

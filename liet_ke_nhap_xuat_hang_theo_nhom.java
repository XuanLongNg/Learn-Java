import java.util.*;

class Product {
    private String id;
    private int importNum, exportNum, price, money, tax;

    public Product(String id, int importNum) {
        this.id = id;
        this.importNum = importNum;
        if (id.charAt(0) == 'A')
            exportNum = (int) Math.round(importNum * 0.6);
        else
            exportNum = (int) Math.round(importNum * 0.7);
        if (id.charAt(id.length() - 1) == 'Y')
            price = 110000;
        else
            price = 135000;
        money = exportNum * price;
        if (id.charAt(0) == 'A' && id.charAt(id.length() - 1) == 'Y')
            tax = (int) Math.round(money * 0.08);
        else if (id.charAt(0) == 'A' && id.charAt(id.length() - 1) == 'N')
            tax = (int) Math.round(money * 0.11);
        else if (id.charAt(0) == 'B' && id.charAt(id.length() - 1) == 'Y')
            tax = (int) Math.round(money * 0.17);
        else
            tax = (int) Math.round(money * 0.22);
    }

    public String getId() {
        return id.substring(0, 1);
    }

    public int getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return id + " " + importNum + " " + exportNum + " " + price + " " + money + " " + tax;
    }
}

public class liet_ke_nhap_xuat_hang_theo_nhom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Product(input.nextLine(), Integer.valueOf(input.nextLine())));
        }
        String k = input.nextLine();
        Collections.sort(arr, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return -o1.getTax() + o2.getTax();
            }
        });
        for (Product p : arr) {
            if (p.getId().equals(k))
                System.out.println(p);
        }
    }
}
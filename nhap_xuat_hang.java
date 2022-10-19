import java.util.*;

class Product {
    String id, name, kindOf;
    long inQuantity, outQuantity, importPrice, interestRate, totalImport, totalPrice;

    Product(String id, String name, String kindOf) {
        this.id = id;
        this.name = name;
        this.kindOf = kindOf;
        if (kindOf.equals("A"))
            interestRate = 8;
        else if (kindOf.equals("B"))
            interestRate = 5;
        else
            interestRate = 2;
        inQuantity = 0;
        outQuantity = 0;
        importPrice = 0;
    }

    void setInQuantity(long inQuantity) {
        this.inQuantity = inQuantity;
    }

    void setOutQuantity(long outQuantity) {
        this.outQuantity = outQuantity;
    }

    void setImportPrice(long importPrice) {
        this.importPrice = importPrice;
    }

    String getId() {
        return id;
    }

    long getInQuantity() {
        return inQuantity;
    }

    long getOutQuantity() {
        return outQuantity;
    }

    long getImportPrice() {
        return importPrice;
    }

    void update() {
        totalImport = inQuantity * importPrice;
        totalPrice = importPrice * outQuantity * (100 + interestRate) / 100;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + totalImport + " " + totalPrice;
    }
}

public class nhap_xuat_hang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Product(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int m = Integer.valueOf(input.nextLine());
        for (int i = 0; i < m; i++) {
            String[] tmp = input.nextLine().split(" ");
            for (Product j : arr) {
                if (j.getId().equals(tmp[0])) {
                    j.setInQuantity(Long.valueOf(tmp[1]));
                    j.setImportPrice(Long.valueOf(tmp[2]));
                    j.setOutQuantity(Long.valueOf(tmp[3]));
                    j.update();
                    System.out.println(j);
                }
            }
        }
    }
}
import java.util.*;

class Warehouse {
    private String id, nameCont;
    private long price, quantity;
    private double intoMoney, tax;

    public Warehouse() {
    }

    public Warehouse(String id, long quantity) {
        this.id = id;
        this.quantity = quantity;
        if (id.substring(3).equals("BP"))
            nameCont = "British Petro";
        else if (id.substring(3).equals("ES"))
            nameCont = "Esso";
        else if (id.substring(3).equals("SH"))
            nameCont = "Shell";
        else if (id.substring(3).equals("CA"))
            nameCont = "Castrol";
        else if (id.substring(3).equals("MO"))
            nameCont = "Mobil";
        else
            nameCont = "Trong Nuoc";
        if (id.charAt(0) == 'X') {
            price = 128000;
            tax = 3;
        } else if (id.charAt(0) == 'D') {
            price = 11200;
            tax = 3.5;
        } else {
            price = 9700;
            tax = 2;
        }
        if (nameCont.equals("Trong Nuoc"))
            tax = 0;
        intoMoney = price * quantity;
        tax = Math.round(intoMoney * tax / 100.0);
        intoMoney = Math.round(intoMoney + tax);
    }

    @Override
    public String toString() {
        return id + " " + nameCont + " " + price + " " + String.format("%.0f %.0f", tax, intoMoney);
    }
}

public class quan_ly_kho_xang_dau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Warehouse> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Warehouse(input.next(), Long.valueOf(input.next())));

        }
        for (Warehouse i : arr) {
            System.out.println(i);
        }
    }
}
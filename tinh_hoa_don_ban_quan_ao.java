import java.util.*;

class Bill {
    private static int count;
    private String id, idFinal, name;
    private int price1, price2, discount, totalPrice;
    private int quantity;

    public Bill() {
    }

    public Bill(String id, String name, int price1, int price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public void addQuantity(int quantity, char kindOf) {
        count++;
        this.quantity = quantity;
        if (kindOf == '1') {
            idFinal = id + "1-" + String.format("%03d", count);
            totalPrice = price1 * quantity;
        } else {
            totalPrice = price2 * quantity;
            idFinal = id + "2-" + String.format("%03d", count);
        }
        if (quantity >= 150) {
            discount = totalPrice * 5 / 10;
        } else if (quantity >= 100) {
            discount = totalPrice * 3 / 10;
        } else if (quantity >= 50) {
            discount = totalPrice * 15 / 100;
        } else {
            discount = 0;
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return idFinal + " " + name + " " + discount + " " + (totalPrice - discount);
    }
}

public class tinh_hoa_don_ban_quan_ao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Bill> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Bill(input.nextLine(), input.nextLine(), Integer.valueOf(input.nextLine()),
                    Integer.valueOf(input.nextLine())));
        }
        int m = Integer.valueOf(input.nextLine());
        for (int i = 0; i < m; i++) {
            String[] tmp = input.nextLine().split(" ");
            String id = tmp[0];
            int quantity = Integer.valueOf(tmp[1]);
            for (int j = 0; j < n; j++) {
                if (arr.get(j).getId().equals(id.substring(0, 2))) {
                    Bill tmp1 = arr.get(j);
                    tmp1.addQuantity(quantity, id.charAt(2));
                    arr.set(j, tmp1);
                    System.out.println(arr.get(j));
                    break;
                }
            }
        }
    }
}
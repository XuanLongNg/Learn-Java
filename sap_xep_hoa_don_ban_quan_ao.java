import java.util.*;

class Bill {
    private static int count;
    private String id, idF, name;
    private int price1, price2, discount, totalPrice;
    private int quantity;

    public Bill() {
    }

    public Bill(String id, String name, int price1, int price2, int quantity, char kindOf) {
        count++;
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
        this.quantity = quantity;
        if (kindOf == '1') {
            idF = id + "1-" + String.format("%03d", count);
            totalPrice = price1 * quantity;
        } else {
            totalPrice = price2 * quantity;
            idF = id + "2-" + String.format("%03d", count);
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

    public int getPracPrice() {
        return totalPrice - discount;
    }

    @Override
    public String toString() {
        return idF + " " + name + " " + discount + " " + (totalPrice - discount);
    }
}

public class sap_xep_hoa_don_ban_quan_ao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        String[] id = new String[n], name = new String[n];
        int[] price1 = new int[n], price2 = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = input.nextLine();
            name[i] = input.nextLine();
            price1[i] = Integer.valueOf(input.nextLine());
            price2[i] = Integer.valueOf(input.nextLine());
        }
        int m = Integer.valueOf(input.nextLine());
        ArrayList<Bill> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] tmp = input.nextLine().split(" ");
            String idtmp = tmp[0];
            int quantity = Integer.valueOf(tmp[1]);
            for (int j = 0; j < n; j++) {
                if (id[j].equals(idtmp.substring(0, 2))) {
                    arr.add(new Bill(id[j], name[j], price1[j], price2[j], quantity, idtmp.charAt(2)));
                    break;
                }
            }
        }
        Collections.sort(arr, new Comparator<Bill>() {
            @Override
            public int compare(Bill b, Bill a) {
                return a.getPracPrice() - b.getPracPrice();
            }
        });
        for (Bill i : arr)
            System.out.println(i);
    }
}
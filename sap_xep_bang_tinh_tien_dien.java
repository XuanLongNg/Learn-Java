import java.util.*;

class Bill {
    private static int count;
    private String id, kindOf;
    private int base, newIndex, oldIndex, intoMoney;
    private double allowance, totalCost;

    public Bill() {

    }

    public Bill(String kindOf, int oldIndex, int newIndex) {
        count++;
        id = "KH" + String.format("%02d", count);
        this.kindOf = kindOf;
        if (kindOf.equals("KD"))
            base = 3;
        else if (kindOf.equals("NN"))
            base = 5;
        else if (kindOf.equals("TT"))
            base = 4;
        else
            base = 2;
        this.newIndex = newIndex;
        this.oldIndex = oldIndex;
        intoMoney = (newIndex - oldIndex) * base * 550;
        if (newIndex - oldIndex < 50)
            allowance = 0;
        else if (newIndex - oldIndex <= 100)
            allowance = Math.round(intoMoney / 100.0 * 35);
        else
            allowance = intoMoney;
        totalCost = intoMoney + allowance;
    }

    public int getTotalCost() {
        return Integer.valueOf(String.format("%.0f", totalCost));
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %.0f %.0f", id, base, intoMoney, allowance, totalCost);
    }
}

public class sap_xep_bang_tinh_tien_dien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Bill> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Bill(input.nextLine(), Integer.valueOf(input.nextLine()), Integer.valueOf(input.nextLine())));
        }
        Collections.sort(arr, new Comparator<Bill>() {
            @Override
            public int compare(Bill b, Bill a) {
                return a.getTotalCost() - b.getTotalCost();
            }
        });
        for (Bill i : arr) {
            System.out.println(i);
        }
    }
}
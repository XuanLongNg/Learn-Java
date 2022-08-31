import java.util.*;

class Phanso {
    private static long tu_so;
    private static long mau_so;

    public Phanso() {
        tu_so = 0;
        mau_so = 1;
    }

    public Phanso(long tu_so, long mau_so) {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }

    public static long GCD(long a, long b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

    public long getTu() {
        return tu_so;
    }

    public long getMau() {
        return mau_so;
    }

    public static void Rutgon() {
        long tmp = GCD(tu_so, mau_so);
        tu_so /= tmp;
        mau_so /= tmp;
    }
}

public class phan_so {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phanso a = new Phanso(input.nextLong(), input.nextLong());
        a.Rutgon();
        System.out.println(a.getTu() + "/" + a.getMau());
    }
}

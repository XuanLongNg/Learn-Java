import java.util.*;

class Phanso {
    private long tu_so;
    private long mau_so;

    public Phanso() {
        tu_so = 0;
        mau_so = 1;
    }

    public Phanso(long tu_so, long mau_so) {
        this.tu_so = tu_so;
        this.mau_so = mau_so;
    }

    public long GCD(long a, long b) {
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

    public void Rutgon() {
        long tmp = GCD(tu_so, mau_so);
        tu_so /= tmp;
        mau_so /= tmp;
    }

    public Phanso Cong(Phanso b) {
        Phanso a = new Phanso();
        a.tu_so = this.tu_so * b.getMau() + b.getTu() * this.mau_so;
        a.mau_so = this.mau_so * b.getMau();
        a.Rutgon();
        return a;
    }

    public Phanso Nhan(Phanso b) {
        Phanso a = new Phanso();
        a.tu_so = this.tu_so * b.getTu();
        a.mau_so = this.mau_so * b.getMau();
        a.Rutgon();
        return a;
    }

    @Override
    public String toString() {
        return tu_so + "/" + mau_so;
    }
}

public class tinh_toan_phan_so {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            Phanso a = new Phanso(input.nextInt(), input.nextInt()), b = new Phanso(input.nextInt(), input.nextInt());
            Phanso c = a.Cong(b), d = a.Nhan(b);
            c = c.Nhan(c);
            d = d.Nhan(c);
            System.out.println(c + " " + d);
        }
    }
}

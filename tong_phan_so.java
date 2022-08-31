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

    public void Rutgon() {
        long tmp = GCD(tu_so, mau_so);
        tu_so /= tmp;
        mau_so /= tmp;
    }

    public void Print() {
        System.out.println(tu_so + "/" + mau_so);
    }

    public void TongPhanso(Phanso B) {
        tu_so = tu_so * B.getMau() + B.getTu() * mau_so;
        mau_so = mau_so * B.getMau();
        Rutgon();
    }
}

public class tong_phan_so {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        int c = input.nextInt(), d = input.nextInt();
        Phanso A = new Phanso(c, d), B = new Phanso(a, b);
        // System.out.println(a + " " + b + " " + c + " " + d + " ");
        // A.Print();
        // B.Print();
        A.TongPhanso(B);
        A.Print();
    }
}

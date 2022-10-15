import java.util.*;

class Complex_num {
    private int number;
    private int complex;
    private String concat;

    public void Concat() {
        if (complex >= 0)
            concat = "+";
        else {
            concat = "-";
        }
    }

    public Complex_num() {
        number = 0;
        complex = 0;
    }

    public Complex_num(int number, int complex) {
        this.number = number;
        this.complex = complex;
        // this.Concat();
    }

    public Complex_num cong(Complex_num other) {
        Complex_num ans = new Complex_num();
        ans.number = this.number + other.number;
        ans.complex = this.complex + other.complex;
        ans.Concat();
        return ans;
    }

    public Complex_num nhan(Complex_num other) {
        Complex_num ans = new Complex_num();
        ans.number = this.number * other.number - this.complex * other.complex;
        ans.complex = this.complex * other.number + this.number * other.complex;
        ans.Concat();
        return ans;
    }

    @Override
    public String toString() {
        return number + " " + concat + " " + Math.abs(complex) + "i";
    }
}

public class so_phuc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        // String tmp = input.nextLine();
        while (t-- > 0) {
            Complex_num a = new Complex_num(input.nextInt(), input.nextInt()),
                    b = new Complex_num(input.nextInt(), input.nextInt());
            Complex_num c = a, d = a.cong(b);
            c = a.cong(b).nhan(c);
            d = d.nhan(d);
            System.out.println(c + ", " + d);
        }
    }
}
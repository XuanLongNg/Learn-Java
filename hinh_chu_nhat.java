import java.util.Scanner;

class HCN {
    public int cd;
    public int cr;

    public int area() {
        return cd * cr;
    }

    public int perimeter() {
        return (cd + cr) * 2;
    }
}

public class hinh_chu_nhat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HCN a = new HCN();
        a.cd = input.nextInt();
        a.cr = input.nextInt();
        if (a.cd <= 0 || a.cr <= 0) {
            System.out.println("0");
        } else {
            System.out.print(a.perimeter() + " " + a.area());

        }
    }
}

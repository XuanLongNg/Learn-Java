import java.util.Scanner;

class Point {
    public int x, y;

    public Point() {
        x = 0;
        y = 0;
    }
}

class HCN extends Point {
    public static Scanner input = new Scanner(System.in);
    public Point A, B;

    public HCN() {
        A = new Point();
        B = new Point();
    }

    public void Set() {
        A.x = input.nextInt();
        A.y = input.nextInt();
        B.x = input.nextInt();
        B.y = input.nextInt();
    }
}

public class hinh_vuong {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        HCN a1 = new HCN(), a2 = new HCN();
        a1.Set();
        a2.Set();
        int maxX, minX, maxY, minY;
        maxX = Math.max(a1.A.x, a1.B.x);
        maxX = Math.max(maxX, Math.max(a2.A.x, a2.B.x));
        maxY = Math.max(a1.A.y, a1.B.y);
        maxY = Math.max(maxY, Math.max(a2.A.y, a2.B.y));
        minX = Math.min(a1.A.x, a1.B.x);
        minX = Math.min(minX, Math.min(a2.A.x, a2.B.x));
        minY = Math.min(a1.A.y, a1.B.y);
        minY = Math.min(minY, Math.min(a2.A.y, a2.B.y));
        int ans = Math.max(Math.abs(maxX - minX), Math.abs(maxY - minY));
        System.out.println(ans * ans);
    }
}

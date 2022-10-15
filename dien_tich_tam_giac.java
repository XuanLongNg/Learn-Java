import java.util.*;

class Point {
    private double x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point secondPoint) {
        double tmp1 = Math.pow(this.x - secondPoint.x, 2), tmp2 = Math.pow(this.y - secondPoint.y, 2);
        return Math.sqrt(tmp1 + tmp2);
    }

    public static double distance(Point p1, Point p2) {
        double tmp1 = Math.pow(p1.x - p2.x, 2), tmp2 = Math.pow(p1.y - p2.y, 2);
        return Math.sqrt(tmp1 + tmp2);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class dien_tich_tam_giac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            double xa = input.nextDouble(), ya = input.nextDouble(),
                    xb = input.nextDouble(), yb = input.nextDouble(),
                    xc = input.nextDouble(), yc = input.nextDouble();
            Point A = new Point(xa, ya), B = new Point(xb, yb), C = new Point(xc, yc);
            double a = A.distance(B), b = B.distance(C), c = C.distance(A);
            if (a + b > c && a + c > b && b + c > a) {
                double ans = Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c)) / 4;
                // System.out.println(x + " " + y + " " + z);
                System.out.printf("%.2f\n", ans);
            } else
                System.out.println("INVALID");
        }
    }
}

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

public class dien_tich_da_giac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            ArrayList<Point> points = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                points.add(new Point(input.nextDouble(), input.nextDouble()));
            }
            double total = 0;
            for (int i = 0; i < n - 1; i++) {
                total += (points.get(i + 1).getX() - points.get(i).getX())
                        * (points.get(i + 1).getY() + points.get(i).getY()) / 2.0;
            }
            total += (points.get(0).getX() - points.get(n - 1).getX())
                    * (points.get(0).getY() + points.get(n - 1).getY()) / 2.0;

            System.out.printf("%.3f\n", Math.abs(total));
        }
    }
}
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

    public static Point nextPoint(Scanner sc) {
        Point p = new Point(sc.nextDouble(), sc.nextDouble());
        return p;
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

class Triangle extends Point {
    private Point a;
    private Point b;
    private Point c;
    private double x;
    private double y;
    private double z;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        x = a.distance(b);
        y = b.distance(c);
        z = c.distance(a);
    }

    public boolean valid() {
        if (x + y <= z || x + z <= y || y + z <= x)
            return false;
        return true;
    }

    public double getPerimeter() {
        return (double) Math.round((x + y + z) * 1000) / 1000;
    }

    @Override
    public String toString() {
        return "Point 1: " + a.getX() + " " + a.getY() + "\nPoint 2: " + b.getX() + " " + b.getY() + "\nPoint 3: "
                + c.getX() + " " + c.getY() + "\nDistance: " + x + " " + y + " " + z;
    }
}

public class lop_triangle_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            // System.out.println(a);
            if (!a.valid()) {
                System.out.println("INVALID");
            } else {
                System.out.println(a.getPerimeter());
            }
        }
    }
}

import java.util.*;

class Point3D {
    public int x;
    public int y;
    public int z;

    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(Point3D p) {
        this.x = p.x;
        this.y = p.y;
        this.z = p.z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int vec1x = p1.getX() - p2.getX(), vec1y = p1.getY() - p2.getY(), vec1z = p1.getZ() - p2.getZ();
        int vec2x = p1.getX() - p3.getX(), vec2y = p1.getY() - p3.getY(), vec2z = p1.getZ() - p3.getZ();
        int vec3x = p1.getX() - p4.getX(), vec3y = p1.getY() - p4.getY(), vec3z = p1.getZ() - p4.getZ();
        p1.x = vec1y * vec2z - vec1z * vec2y;
        p1.y = vec1z * vec2x - vec1x * vec2z;
        p1.z = vec1x * vec2y - vec1y * vec2x;
        return (p1.x * vec3x + p1.y * vec3y + p1.z * vec3z) == 0;
    }

}

public class bon_diem_tren_mat_phang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
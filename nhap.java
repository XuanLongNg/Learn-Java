import java.util.*;

abstract class Shape {
    abstract void draw();

    abstract double perimeter();

    abstract double area();
}

class Rectangle extends Shape {
    private double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectange...");
    }

    double perimeter() {
        return (width + height) * 2;
    }

    double area() {
        return width * height;
    }
}

class Square extends Shape {
    private double edge;

    Square(double edge) {
        this.edge = edge;
    }

    @Override
    void draw() {
        System.out.println("Drawing Square...");
    }

    double perimeter() {
        return edge * 4;
    }

    double area() {
        return edge * edge;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle...");
    }

    double perimeter() {
        return radius * Math.PI * 2;
    }

    double area() {
        return radius * radius * Math.PI;
    }
}

public class nhap {
    void BinarySearch(int[] arr, int l, int r, int key) {
        int mid = (l + r) / 2;
        while (l < r) {
            mid = (l + r) / 2;
            if (arr[mid] >= key)
                r = mid;
            else
                l = mid + 1;
        }
        return arr[l] == key;
    }

    void quickSort(int Data[], int l, int r) {
        if (l <= r) {
            int key = Data[(l + r) / 2];

            int i = l;
            int j = r;

            while (i <= j) {
                while (Data[i] < key)
                    i++;
                while (Data[j] > key)
                    j--;

                if (i <= j) {
                    swap(Data[i], Data[j]);
                    i++;
                    j--;
                }
            }

            if (l < j)
                quickSort(Data, l, j);
            if (r > i)
                quickSort(Data, i, r);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(input.nextDouble(), input.nextDouble());
        Square square = new Square(input.nextDouble());
        Circle circle = new Circle(input.nextDouble());
        rectangle.draw();
        System.out.printf("Perimeter: %.3f\nArea: %.3f\n", rectangle.perimeter(), rectangle.area());
        square.draw();
        System.out.printf("Perimeter: %.3f\nArea: %.3f\n", square.perimeter(), square.area());
        circle.draw();
        System.out.printf("Perimeter: %.3f\nArea: %.3f\n", circle.perimeter(), circle.area());
    }
}

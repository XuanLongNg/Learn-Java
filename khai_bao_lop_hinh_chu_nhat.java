import java.util.*;

class Rectange {
    private double width;
    private double height;
    private String color;

    public static String setcolor(String color) {
        color = color.toLowerCase();
        char[] rep = Character.toChars((int) color.charAt(0) - 32);
        StringBuilder temp = new StringBuilder(color);
        temp.setCharAt(0, rep[0]);
        color = temp.toString();
        return color;
    }

    public Rectange() {
        width = 1;
        height = 1;
    }

    public Rectange(double width, double height, String color) {
        color = setcolor(color);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        color = setcolor(color);
        this.color = color;
    }

    public double findArea() {
        return (width * height);
    }

    public double findPerimeter() {
        return (width + height) * 2;
    }
}

public class khai_bao_lop_hinh_chu_nhat {
    public static boolean isNumeric(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
                continue;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tmp = input.nextLine();
        String[] arr = tmp.split(" ");
        if (isNumeric(arr[0]) == false || isNumeric(arr[1]) == false || arr.length > 3) {
            System.out.println("INVALID");
            return;
        }
        if (Integer.valueOf(arr[0]) <= 0 || Integer.valueOf(arr[1]) <= 0) {
            System.out.println("INVALID");
            return;
        }
        Rectange a = new Rectange(Integer.valueOf(arr[0]), Integer.valueOf(arr[1]), arr[2]);
        System.out.printf("%.0f %.0f %s", a.findPerimeter(), a.findArea(), a.getColor());
    }
}

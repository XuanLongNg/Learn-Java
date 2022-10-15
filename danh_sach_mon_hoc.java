import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

class Subject {
    private String ID;
    private String name;
    private int creditNumber;

    public Subject() {
        ID = "";
        name = "";
        creditNumber = 0;
    }

    public String getID() {
        return ID;
    }

    public Subject(String ID, String name, int creditNumber) {
        this.ID = ID;
        this.name = name;
        this.creditNumber = creditNumber;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + creditNumber;
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        InputStream file = new FileInputStream("MONHOC.in");
        Scanner input = new Scanner(file);
        int n = Integer.valueOf(input.nextLine());
        List<Subject> arr = new ArrayList<Subject>();
        for (int i = 0; i < n; i++) {
            arr.add(new Subject(input.nextLine(), input.nextLine(), Integer.valueOf(input.nextLine())));
        }
        Collections.sort(arr, new Comparator<Subject>() {
            @Override
            public int compare(Subject o2, Subject o1) {
                int n = o1.getID().length(), m = o2.getID().length(), k = Math.min(n, m);
                for (int i = 0; i < k; i++) {
                    if ((int) o1.getID().charAt(i) != (int) (o2.getID().charAt(i)))
                        return (int) (o1.getID().charAt(i))
                                - (int) (o2.getID().charAt(i));
                }
                return n - m;
            }
        });
        for (Subject i : arr) {
            System.out.println(i);
        }
    }
}

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

class Subject {
    private String ID;
    private String name;
    private String form;

    public Subject() {
        ID = "";
        name = "";
        form = "";
    }

    public String getID() {
        return ID;
    }

    public Subject(String ID, String name, String form) {
        this.ID = ID;
        this.name = name;
        this.form = form;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + form;
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        InputStream file = new FileInputStream("MONHOC.in");
        Scanner input = new Scanner(file);
        int n = Integer.valueOf(input.nextLine());
        List<Subject> arr = new ArrayList<Subject>();
        for (int i = 0; i < n; i++) {
            arr.add(new Subject(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
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

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.io.*;

class Subject {
    String ID, name, theoForm, pracForm;
    int tinchi;

    public String getID() {
        return ID;
    }

    public Subject(String ID, String name, int tinchi, String theoForm, String pracForm) {
        this.ID = ID;
        this.name = name;
        this.tinchi = tinchi;
        this.theoForm = theoForm;
        this.pracForm = pracForm;
    }

    @Override
    public String toString() {
        return ID + " " + name + " " + tinchi + " " + theoForm + " " + pracForm;
    }
}

public class dang_ki_hinh_thuc_giang_day {
    public static void main(String[] args) throws IOException, ParseException, ClassNotFoundException {
        Scanner input = new Scanner(new File("MONHOC.in"));
        // Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        List<Subject> arr = new ArrayList<Subject>();
        for (int i = 0; i < n; i++) {
            arr.add(new Subject(input.nextLine(), input.nextLine(), Integer.valueOf(input.nextLine()), input.nextLine(),
                    input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getID().compareTo(o2.getID());
            }
        });
        for (Subject i : arr) {
            if (!i.pracForm.equals("Truc tiep"))
                System.out.println(i);
        }
    }
}

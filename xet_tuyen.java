import java.util.*;
import java.io.*;

class Candidate {
    static int count;
    String id, name, title;
    double theoPoint, pracPoint, avg, reward, point;
    String date;
    int age;

    Candidate(String name, String date, double theoPoint, double pracPoint) {
        id = String.format("PH%02d", ++count);
        name = name.trim().toLowerCase();
        String[] tmp = name.split("[,. @!]+");
        name = "";
        for (String i : tmp)
            if (i != "" && i != " ")
                name += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        this.name = name;
        if (date.charAt(2) != '/')
            date = "0" + date;
        if (date.charAt(5) != '/')
            date = date.substring(0, 3) + "0" + date.substring(3);
        this.date = date.substring(0, 10);
        age = 2021 - Integer.valueOf(date.substring(6));
        this.theoPoint = theoPoint;
        this.pracPoint = pracPoint;
        avg = (theoPoint + pracPoint) / 2;
        reward = 0;
        if (theoPoint >= 8 && pracPoint >= 8)
            reward = 1;
        else if (theoPoint >= 7.5 && pracPoint >= 7.5)
            reward = 0.5;
        // System.out.println(avg);
        point = Math.round(avg + reward);
        if (point > 10)
            point = 10;
        if (point < 5)
            title = "Truot";
        else if (point < 7)
            title = "Trung binh";
        else if (point < 8)
            title = "Kha";
        else if (point < 9)
            title = "Gioi";
        else
            title = "Xuat sac";

    }

    @Override
    public String toString() {
        return id + " " + name + age + String.format(" %.0f ", point) + title;
    }
}

public class xet_tuyen {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Candidate> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Candidate(input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Double.valueOf(input.nextLine())));
        }
        for (Candidate i : arr)
            System.out.println(i);
    }
}
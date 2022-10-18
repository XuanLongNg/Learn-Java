import java.util.*;

class Candidate {
    private static int count;
    private String id, name, date;
    private double point, theoPoint, pracPoint, priority, totalPoints;
    private int age;
    private String status;

    public Candidate() {
    }

    public void chuan_hoa(String name) {
        String[] tmp = name.split(" ");
        name = "";
        for (String s : tmp) {
            s = s.toLowerCase();
            name += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
        }
        this.name = name;
    }

    public Candidate(String name, String date, double theoPoint, double pracPoint) {
        count++;
        id = "PH" + String.format("%02d", count);
        chuan_hoa(name);
        this.date = date;
        this.theoPoint = theoPoint;
        this.pracPoint = pracPoint;
        age = 2021 - Integer.parseInt(date.substring(6));
        point = (theoPoint + pracPoint) / 2;
        if (theoPoint >= 8 && pracPoint >= 8)
            priority = 1;
        else if (theoPoint >= 7.5 && pracPoint >= 7.5)
            priority = 0.5;
        else
            priority = 0;
        totalPoints = Math.round(point + priority);
        if (totalPoints > 10)
            totalPoints = 10;
        if (totalPoints >= 9)
            status = "Xuat sac";
        else if (totalPoints >= 8)
            status = "Gioi";
        else if (totalPoints >= 7)
            status = "Kha";
        else if (totalPoints >= 5)
            status = "Trung binh";
        else
            status = "Truot";
    }

    public double getTotal() {
        return totalPoints;
    }

    public double getPoint() {
        return point;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + age + " " + String.format("%.0f", totalPoints) + " " + status;
    }
}

public class sap_xep_ket_qua_xet_tuyen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Candidate> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Candidate(input.nextLine(), input.nextLine(), Double.valueOf(input.nextLine()),
                    Double.valueOf(input.nextLine())));

        }
        Collections.sort(arr, new Comparator<Candidate>() {
            @Override
            public int compare(Candidate o2, Candidate o1) {
                if (o1.getTotal() == o2.getTotal())
                    return o2.getId().compareTo(o1.getId());
                if (o1.getTotal() > o2.getTotal())
                    return 1;
                return -1;
            }
        });
        for (Candidate candidate : arr) {
            System.out.println(candidate);
        }
    }
}
import java.util.*;

class Time {
    private String id;
    private String name;
    private String checkIn;
    private String checkOut;
    private int totalHour;
    private int totalMinute;

    public Time() {

    }

    public Time(String id, String name, String checkIn, String checkOut) {
        this.id = id;
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        totalHour += Integer.parseInt(checkOut.substring(0, 2)) - Integer.parseInt(checkIn.substring(0, 2));
        totalMinute += Integer.parseInt(checkOut.substring(3)) - Integer.parseInt(checkIn.substring(3));
        if (totalMinute < 0) {
            totalHour--;
            totalMinute = 60 + totalMinute;
        }
    }

    public int getHour() {
        return totalHour;
    }

    public int getMinute() {
        return totalMinute;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + totalHour + " gio " + totalMinute + " phut";
    }
}

public class Tinh_gio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            times.add(new Time(input.nextLine(), input.nextLine(), input.nextLine(),
                    input.nextLine()));
        }
        Collections.sort(times, new Comparator<Time>() {
            @Override
            public int compare(Time o2, Time o1) {
                if (o1.getHour() != o2.getHour())
                    return o1.getHour() - o2.getHour();
                return o1.getMinute() - o2.getMinute();
            }
        });
        for (Time p : times) {
            System.out.println(p);
        }
    }
}
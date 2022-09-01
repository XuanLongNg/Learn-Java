import java.util.*;

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return hour + " " + minute + " " + second;
    }
}

public class sap_xep_thoi_gian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Time> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(new Time(input.nextInt(), input.nextInt(), input.nextInt()));
        }
        Collections.sort(arr, new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                if (o1.getHour() != o2.getHour())
                    return o1.getHour() - o2.getHour();
                else if (o1.getMinute() != o2.getMinute())
                    return o1.getMinute() - o2.getMinute();
                else
                    return o1.getSecond() - o2.getSecond();
            }
        });
        for (Time i : arr) {
            System.out.println(i);
        }
    }
}

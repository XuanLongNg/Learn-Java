import java.util.*;

class Athlete {
    private static int count;
    private String id, name, date, pracRecord, rankRecord;
    private int priority, ranking, age;

    public Athlete() {
    }

    public int toSecond(String s) {
        int hour = Integer.valueOf(s.substring(0, 2)), min = Integer.valueOf(s.substring(3, 5)),
                sec = Integer.valueOf(s.substring(6));
        return hour * 60 * 60 + min * 60 + sec;
    }

    public String toTime(int second) {
        int hour = second / (60 * 60);
        second -= hour * 60 * 60;
        int min = second / 60;
        second -= min * 60;
        return String.format("%02d:%02d:%02d", hour, min, second);
    }

    public Athlete(String name, String date, String start, String end) {
        count++;
        id = "VDV" + String.format("%02d", count);
        this.name = name;
        this.date = date;
        age = 2021 - Integer.valueOf(date.substring(6, 10));
        if (age < 18)
            priority = 0;
        else if (age < 25)
            priority = 1;
        else if (age < 33)
            priority = 2;
        else
            priority = 3;
        int tmp = toSecond(start), tmp1 = toSecond(end);
        tmp = tmp1 - tmp;
        pracRecord = toTime(tmp);
        rankRecord = toTime(toSecond(pracRecord) - priority);
    }

    public int getRankRecord() {
        return toSecond(rankRecord);
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + pracRecord + " " + toTime(priority) + " " + rankRecord + " " + ranking;
    }
}

public class xep_hang_van_dong_vien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Athlete> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Athlete(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Athlete>() {
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return o1.getRankRecord() - o2.getRankRecord();
            }
        });
        Map<Integer, Integer> ranking = new TreeMap<>();
        for (Athlete p : arr) {
            if (ranking.containsKey(p.getRankRecord()))
                ranking.put(p.getRankRecord(), ranking.get(p.getRankRecord()) + 1);
            else
                ranking.put(p.getRankRecord(), 1);
        }
        int r = 1, pre = 0;
        for (Integer i : ranking.keySet()) {
            for (Athlete p : arr) {
                if (p.getRankRecord() == i) {
                    p.setRanking(r);
                }
            }
            // pre = ranking.get(i);
            r += ranking.get(i);
        }
        for (Athlete i : arr) {
            System.out.println(i);
        }
    }
}
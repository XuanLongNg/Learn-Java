import java.util.*;

class Room {
    private String ID;
    private String nameCus;
    private String RoomNum;
    private String startDate;
    private String endDate;
    private int serExpenses;
    private int time;
    private int cost;
    private int cost_for_floor;

    public int setTime() {
        int strdate = Integer.valueOf(startDate.substring(0, 2)), enddate = Integer.valueOf(endDate.substring(0, 2));
        int strmon = Integer.valueOf(startDate.substring(3, 5)), endmon = Integer.valueOf(endDate.substring(3, 5));
        int total = 0;
        if (strmon == endmon)
            total = enddate - strdate + 1;
        else {
            while (strmon < endmon) {
                if (strmon == 1 || strmon == 3 || strmon == 5 || strmon == 7 || strmon == 8 || strmon == 10
                        || strmon == 12) {
                    total += 31 - strdate;
                    strdate = 0;
                    strmon++;
                } else if (strmon == 2) {
                    total += 28 - strdate;
                    strdate = 0;
                    strmon++;
                } else {
                    total += 30 - strdate;
                    strdate = 0;
                    strmon++;
                }
            }
            total += enddate + 1;
        }
        return total;
    }

    public Room(int id, String nameCus, String RoomNum, String startDate, String endDate, int serExpenses) {
        String tmp = "KH";
        if (id < 10)
            tmp += "0";
        tmp += String.valueOf(id);
        ID = tmp;
        this.nameCus = nameCus;
        this.RoomNum = RoomNum;
        this.startDate = startDate;
        this.endDate = endDate;
        this.serExpenses = serExpenses;
        int temp = Integer.valueOf(RoomNum.charAt(0) - '0');
        // System.out.println(temp);
        if (temp == 1)
            cost_for_floor = 25;
        else if (temp == 2)
            cost_for_floor = 34;
        else if (temp == 3)
            cost_for_floor = 50;
        else
            cost_for_floor = 80;
        time = setTime();
        cost = cost_for_floor * time + serExpenses;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return ID + " " + nameCus + " " + RoomNum + " " + time + " " + cost;
    }
}

public class hoa_don_khach_san {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String tmp = input.nextLine();
        ArrayList<Room> rooms = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            rooms.add(new Room(i + 1, input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(),
                    Integer.valueOf(input.nextLine())));
        }
        Collections.sort(rooms, new Comparator<Room>() {
            @Override
            public int compare(Room o1, Room o2) {
                return o2.getCost() - o1.getCost();
            }
        });
        for (Room i : rooms) {
            System.out.println(i);
        }
    }
}

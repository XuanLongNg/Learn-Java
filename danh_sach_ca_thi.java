import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

class cathi {
    static int count;
    String id, roomId, time;
    LocalDate date;

    cathi(String date, String time, String roomId) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        id = String.format("C%03d", ++count);
        this.date = LocalDate.parse(date, format);
        // this.date = date;
        this.roomId = roomId;
        this.time = time;
    }

    @Override
    public String toString() {
        return id + " " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + time + " " + roomId;
    }
}

public class danh_sach_ca_thi {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("CATHI.in"));
        // Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<cathi> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new cathi(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<cathi>() {
            @Override
            public int compare(cathi o1, cathi o2) {
                if (o1.date.equals(o2.date)) {
                    if (o1.time.equals(o2.time)) {
                        return o1.id.compareTo(o2.id);
                    }
                    return o1.time.compareTo(o2.time);
                }
                return o1.date.compareTo(o2.date);
            }
        });
        for (cathi i : arr)
            System.out.println(i);
    }
}
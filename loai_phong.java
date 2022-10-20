import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable<LoaiPhong> {
    String id, name, dayPrice, serviceCost;

    LoaiPhong(String k) {
        String[] tmp = k.split(" ");
        this.id = tmp[0];
        this.name = tmp[1];
        this.dayPrice = tmp[2];
        this.serviceCost = tmp[3];
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dayPrice + " " + serviceCost;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return name.compareTo(o.name);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0) {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds) {
            System.out.println(tmp);
        }
    }
}
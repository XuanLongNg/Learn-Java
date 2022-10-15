import java.util.*;

class TaiNguyen {
    private String name;
    private String description;

    public TaiNguyen() {
    }

    public TaiNguyen(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

class Sach extends TaiNguyen {
    private String MaSach;
    private double GiaSach;

    public Sach() {

    }

    public Sach(String MaSach, double GiaSach, TaiNguyen k) {
        this.MaSach = MaSach;
        this.GiaSach = GiaSach;
        this.setName(k.getName());
        this.setDescription(k.getDescription());
    }

    public double getGiaSach() {
        return GiaSach;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public void setGiaSach(double GiaSach) {
        this.GiaSach = GiaSach;
    }

    @Override
    public String toString() {
        return MaSach + " " + this.getName() + " " + this.getDescription() + " " + GiaSach + "\n";
    }
}

class CongTy {
    private String name;
    private String description;
    private ArrayList<Sach> list = new ArrayList<Sach>();

    public CongTy() {

    }

    public CongTy(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void NhapSach(Sach tmp) {
        for (Sach i : list)
            if (i.getMaSach().equals(tmp.getMaSach()))
                return;
        list.add(tmp);
        Collections.sort(list, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                if (o1.getGiaSach() - o2.getGiaSach() > 0)
                    return 1;
                else if (o1.getGiaSach() - o2.getGiaSach() < 0)
                    return -1;
                return 0;
            }
        });
    }

    public Sach TimKiem() {
        return list.get(0);
    }

    public void SuaSach(String id, String description) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaSach().equals(id)) {
                Sach tmp = list.get(i);
                tmp.setDescription(description);
                list.set(i, tmp);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String ans = "Ten cong ty: " + name + "\nMo ta: " + description;
        ans += "\nDanh sach chua sach cua cong ty:\n";
        for (Sach i : list) {
            ans += i;
        }
        return ans;
    }
}

public class bai_tap_ke_thua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CongTy congty = new CongTy(input.nextLine(), input.nextLine());
        int n = Integer.valueOf(input.nextLine());

        // Nhap sach
        for (int i = 0; i < n; i++) {
            Sach tmp = new Sach(input.nextLine(), Double.valueOf(input.nextLine()),
                    new TaiNguyen(input.nextLine(), input.nextLine()));
            congty.NhapSach(tmp);
        }

        // Tim kiem
        System.out.println(congty);
        System.out.print("Sach re nhat: ");
        System.out.println(congty.TimKiem());

        // Sua sach

        congty.SuaSach(input.nextLine(), input.nextLine());

        System.out.println(congty);
    }
}
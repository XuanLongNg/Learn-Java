import java.util.*;

class Company {
    private String id, name, stuQuantity;

    public Company() {

    }

    public Company(String id, String name, String stuQuantity) {
        this.id = id;
        this.name = name;
        this.stuQuantity = stuQuantity;
    }

    public String getID() {
        return id;
    }

    public int getStuQuantity() {
        return Integer.valueOf(stuQuantity);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + stuQuantity;
    }
}

public class danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Company> arr = new ArrayList<Company>();
        for (int i = 0; i < n; i++) {
            arr.add(new Company(input.nextLine(), input.nextLine(), input.nextLine()));
        }
        Collections.sort(arr, new Comparator<Company>() {
            @Override
            public int compare(Company o2, Company o1) {
                if (o1.getStuQuantity() == o2.getStuQuantity()) {
                    // int k = Math.min(o1.getName(),o2.getName());
                    // for (int i = 0; i < k; i++)
                    // if(o1.getName().charAt(i)!=o2.getName().charAt(i)) return (int) p
                    return o2.getID().compareTo(o1.getID());
                }
                return o1.getStuQuantity() - o2.getStuQuantity();
            }
        });
        for (Company c : arr) {
            System.out.println(c);
        }
    }
}

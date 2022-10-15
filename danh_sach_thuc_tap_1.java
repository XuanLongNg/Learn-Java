import java.util.*;

class Intern {
    private static int count;
    private int id;
    private String idStu, name, classS, email, nameEnterprise;

    public Intern() {
    }

    public Intern(String idStu, String name, String classS, String email, String nameEnterprise) {
        count++;
        id = count;
        this.idStu = idStu;
        this.name = name;
        this.classS = classS;
        this.email = email;
        this.nameEnterprise = nameEnterprise;
    }

    public String getName() {
        return name;
    }

    public String getNameEnterprise() {
        return nameEnterprise;
    }

    @Override
    public String toString() {
        return id + " " + idStu + " " + name + " " + classS + " " + email + " " + nameEnterprise;
    }

}

public class danh_sach_thuc_tap_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Intern> list = new ArrayList<Intern>();
        for (int i = 0; i < n; i++)
            list.add(new Intern(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(),
                    input.nextLine()));
        Collections.sort(list, new Comparator<Intern>() {
            @Override
            public int compare(Intern o1, Intern o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        int m = Integer.valueOf(input.nextLine());
        for (int i = 0; i < m; i++) {
            String enterprise = input.nextLine();
            for (Intern j : list) {
                if (j.getNameEnterprise().equals(enterprise))
                    System.out.println(j);
            }
        }
    }
}
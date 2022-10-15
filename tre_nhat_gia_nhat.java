import java.util.*;

class Person {
    private String name, date;

    public Person() {

    }

    public Person(String name, String date) {
        this.name = name;
        String[] tmp = date.split("/");
        date = "";
        for (int i = tmp.length - 1; i >= 1; i--)
            date += tmp[i] + "/";
        date += tmp[0];
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + date;
    }
}

public class tre_nhat_gia_nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Person> arr = new ArrayList<Person>();
        for (int i = 0; i < n; i++)
            arr.add(new Person(input.next(), input.next()));
        Collections.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o2, Person o1) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        System.out.println(arr.get(0).getName());
        System.out.println(arr.get(n - 1).getName());
    }
}
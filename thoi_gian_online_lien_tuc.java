import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;

class Student {
    String name;
    long time;

    Student(String name, String st, String en, String timest, String timeen) {
        this.name = name;
        DateTimeFormatter k = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"),
                h = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime s = LocalDateTime.parse(st + " " + timest, k),
                e = LocalDateTime.parse(en + " " + timeen, k);
        time = Duration.between(s, e).toMinutes();
    }

    long getTime() {
        return time;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + time;
    }
}

public class thoi_gian_online_lien_tuc {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(new File("ONLINE.in"));
        // Scanner input = new Scanner(System.in);
        int n = Integer.valueOf(input.nextLine());
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = input.nextLine(), st = input.nextLine(), en = input.nextLine();
            String[] s = st.split(" "), e = en.split(" ");
            arr.add(new Student(name, s[0], e[0], s[1], e[1]));
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getTime() == o2.getTime())
                    return o1.getName().compareTo(o2.getName());
                else if (o1.getTime() < o2.getTime())
                    return 1;
                return -1;
            }
        });
        for (Student i : arr)
            System.out.println(i);
    }
}
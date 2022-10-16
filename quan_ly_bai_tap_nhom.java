import java.util.*;

class Student {
    private String id, name, phoneNum, serial, exerciseName;

    public Student() {

    }

    public Student(String id, String name, String phoneNum, String serial) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.serial = serial;
    }

    public String getId() {
        return id;
    }

    public int getSerial() {
        return Integer.valueOf(serial);
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phoneNum + " " + serial + " " + exerciseName;
    }
}

public class quan_ly_bai_tap_nhom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tmpin = input.nextLine().split(" ");
        int n = Integer.valueOf(tmpin[0]);
        int m = Integer.valueOf(tmpin[1]);
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        String[] exerciseName = new String[m];
        for (int i = 0; i < m; i++) {
            exerciseName[i] = input.nextLine();
            for (int j = 0; j < n; j++) {
                if (arr.get(j).getSerial() == i + 1)
                    arr.get(j).setExerciseName(exerciseName[i]);
            }
        }
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (Student i : arr)
            System.out.println(i);

    }
}
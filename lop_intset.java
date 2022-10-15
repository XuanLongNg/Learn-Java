import java.util.*;

class IntSet {
    private Set<Integer> set = new TreeSet<Integer>();

    public IntSet() {
    }

    public IntSet(int[] arr) {
        for (int i : arr)
            set.add(i);
    }

    public Set<Integer> getSet() {
        return set;
    }

    public IntSet union(IntSet o1) {
        IntSet setans = new IntSet();
        setans.set.addAll(set);
        setans.set.addAll(o1.getSet());
        return setans;
    }

    @Override
    public String toString() {
        String ans = "";
        for (Integer i : set) {
            ans += i.toString() + " ";
        }
        return ans;
    }
}

public class lop_intset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

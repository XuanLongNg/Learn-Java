import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void check(ArrayList<Integer> tmp, ArrayList<String> ans) {
        ArrayList<Integer> k = new ArrayList<Integer>();
        k.addAll(tmp);
        int j = 0;
        while (j < k.size()) {
            if (k.get(j) == 0)
                k.remove(j);
            else
                j++;
        }
        if (k.size() < 2)
            return;
        for (int i = 0; i < k.size() - 1; i++) {
            if (k.get(i) > k.get(i + 1))
                return;
        }
        String temp = "";
        for (Integer i : k) {
            temp += String.valueOf(i) + " ";
        }
        if (ans.contains(temp))
            return;
        // System.out.println("Add complete");
        ans.add(temp);
    }

    public static void Try(ArrayList<Integer> tmp, ArrayList<Integer> arr, int n, int i, ArrayList<String> ans) {
        if (i == n) {
            check(tmp, ans);
            return;
        }
        for (int j = 0; j < 2; j++) {
            if (j == 1) {
                tmp.set(i, arr.get(i));
            } else
                tmp.set(i, 0);
            Try(tmp, arr, n, i + 1, ans);
        }
    }

    public static void main(String[] args) {
        try {
            File myObj = new File("DAYSO.in");
            Scanner myReader = new Scanner(myObj);
            String n = myReader.nextLine();
            String tmp = myReader.nextLine();
            String[] arrtmp = tmp.split(" ");
            ArrayList<Integer> arr = new ArrayList<Integer>(), temp = new ArrayList<Integer>();
            ArrayList<String> ans = new ArrayList<String>();
            for (String i : arrtmp) {
                arr.add(Integer.valueOf(i));
                temp.add(Integer.valueOf(0));
            }
            int k = Integer.valueOf(n);
            Try(temp, arr, k, 0, ans);
            Collections.sort(ans);
            // System.out.println("End");

            for (String i : ans)
                System.out.println(i);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File don't exits");
            e.printStackTrace();
        }
    }
}

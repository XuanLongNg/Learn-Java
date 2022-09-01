import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

class WordSet {
    private Set<String> words = new TreeSet<String>();

    private void readWords(String file) {
        try {
            File tmp = new File(file);
            Scanner scanner = new Scanner(tmp);
            while (scanner.hasNext()) {
                words.add(scanner.next().toLowerCase());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File don't exits");
            e.printStackTrace();
        }
    }

    public WordSet(String file) {
        readWords(file);
    }

    @Override
    public String toString() {
        String ans = "";
        for (String word : words) {
            ans += word + "\n";
        }
        return ans;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

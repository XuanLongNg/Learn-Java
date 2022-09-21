import java.util.*;

class WordSet {
    private Set<String> words = new TreeSet<String>();

    public WordSet() {
    }

    public WordSet(String word) {
        word = word.toLowerCase();
        word = word.trim();
        String[] tmp = word.split(" ");
        for (String i : tmp)
            words.add(i);
    }

    public WordSet union(WordSet w2) {
        WordSet uni = new WordSet();
        for (String i : words)
            uni.words.add(i);
        for (String i : w2.words)
            uni.words.add(i);
        return uni;
    }

    public WordSet intersection(WordSet w2) {
        WordSet uni = new WordSet();
        for (String i : words)
            if (w2.words.contains(i))
                uni.words.add(i);
        return uni;
    }

    @Override
    public String toString() {
        String ans = "";
        for (String i : words)
            ans += i + " ";
        return ans;
    }
}

public class Word_Set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

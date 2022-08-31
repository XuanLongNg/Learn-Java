public class nhap {
    public static void main(String args[]) {
        String str = "word1, word2 word3@word4?word5.word6";
        str = "   nGuYEN    vAN    naM";
        String[] arrOfStr = str.split("[, ?.@]+");

        for (String a : arrOfStr)
            System.out.println(a);
    }
}

package pl.waw.sgh;

public class PlayWithText {

    public static void main(String[] args) {
        String s = "abc";
        String s2 = "def";

        System.out.println(s + s2);

        int slen = s.length();
        System.out.println(s.lastIndexOf(1));

        String s4 = "ABC";
        String s5 = new String("ABC");

        if (s4.equals(s5)) {
            System.out.println("s4 and s5 are equal");
        } else {
            System.out.println("s4 and s5 are not equal");
        }
    }
}



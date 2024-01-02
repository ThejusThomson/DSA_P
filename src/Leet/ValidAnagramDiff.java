package Leet;

import java.util.Arrays;

public class ValidAnagramDiff {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        System.out.println(new String(charS)+"  "+new String(charS));

        if(Arrays.equals(charS,charT)) {
            System.out.println(true);
        }
        else {
            System.out.println("false");
        }
    }
}

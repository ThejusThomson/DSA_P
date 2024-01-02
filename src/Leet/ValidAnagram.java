package Leet;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if (s.length() != t.length())
            System.out.println("false");

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0)
            System.out.println("false");

        System.out.println("false");
    }
}

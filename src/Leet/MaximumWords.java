package Leet;

public class MaximumWords {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<sentences.length; i++) {
            int count = 1;
            for(char c: sentences[i].toCharArray()) {
                if(c == ' ') {
                    count++;
                }
            }
            if (count > max)
                max = count;
        }
        System.out.println(max);;
    }
}

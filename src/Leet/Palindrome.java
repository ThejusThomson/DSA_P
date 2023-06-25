package Leet;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int x = num, rev = 0;
        while (x > 0){
            rev = rev*10+(x%10);
            x/=10;
        }
        System.out.println("num: "+num);
        System.out.println("rev: "+rev);
    }
}

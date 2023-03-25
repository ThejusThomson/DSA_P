package Milestone12;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rnum = 0, rem = 0;
        for(int i = n; i>0; i/=10) {
            rem = i%10;
            rnum=10*rnum+rem;
        }
        System.out.println(rnum);
    }
}

package Milestone12;

import java.util.Scanner;

public class Binary2DecimalNin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dec = 0, pow = 1;
        while (n>0) {
            int last = n%10;
            dec = dec + last*pow;
            pow*=2;
            n/=10;
        }
        System.out.println(dec);
    }
}

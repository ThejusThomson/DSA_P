package Milestone12;

import java.util.Scanner;

public class Binary2Decimal {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digits = 0;
        for(int i=n; i>0; i/=10) {
            digits++;
        }
        int [] ar = new int[digits];
        for(int j=0;j<digits;j++){
            ar[j] = n%10;
            n/=10;
        }
        double dec = 0;
        for(int k=0;k<digits;k++){
            int temD = ar[k];
            dec = dec + temD*Math.pow(2,k);
        }
        System.out.println((int)dec);
    }
}

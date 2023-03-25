package Milestone1;

import java.util.Scanner;

public class Pattern6Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i=1;
        while (i <= n/2 + 1) {
            int j=1;
            while (j <= n/2-i+1) {  //spaces
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i)  //increasing
            {
                System.out.print("*");
                k++;
            }
            int l = 0;
            while (l <= i-2)  //decreasing
            {
                System.out.print("*");
                l++;
            }
            System.out.println();
            i++;
        }
        while (i <= n) {
            int j = 1;
            while (j <= i-n/2-1) {  //spaces
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= n-i+1)  //increasing
            {
                System.out.print("*");
                k++;
            }
            int l = 1;
            while (l <= n-i)  //decreasing
            {
                System.out.print("*");
                l++;
            }
            System.out.println();
            i++;
        }
        s.close();
    }
}

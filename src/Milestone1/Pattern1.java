package Milestone1;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i=1, j=1;
        while (i <= n) {
            while (j <= n) {
                //System.out.print(j+" ");
                //System.out.print("* ");
                //System.out.print(i+" ");
                //System.out.print(n-(i-1)+ " ");
                //System.out.print(n-(j-1)+" ");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }

        s.close();
    }
}

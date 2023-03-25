package Milestone1;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i=1, j=1;
        char k = 'A',l='A';
        while (i <= n) {
            while (j <= n) {
                System.out.print(k+" ");
                //System.out.print("* ");
                //System.out.print(i+" ");
                //System.out.print(n-(i-1)+ " ");
                //System.out.print(n-(j-1)+" ");
                j++;
                k++;
            }
            System.out.println();
            i++;
            j=1;
            l++;
            k=l;
        }

        s.close();
    }
}

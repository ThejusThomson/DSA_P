package Milestone1;

import java.util.Scanner;

public class Pattern5Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i=1, j=1, k=1;
        while (i <= n) {
            while (j <= n-i) {  //spaces
                System.out.print(" ");
                j++;
            }
            while (k <= i)  //increasing
            {
                System.out.print(k);
                k++;
            }
            int l = i-1;
            while (l >= 1)  //decreasing
            {
                System.out.print(l);
                l--;
            }
            System.out.println();
            i++;
            j=1;
            k=1;
        }
        s.close();
    }
}

package Milestone1;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i=1, j=1;
        while (i <= n) {
            while (j <= n-i) {
                System.out.print(" ");
                j++;
            }
            while (j > n-i && j <= n)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }

        s.close();
    }
}

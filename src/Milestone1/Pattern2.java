package Milestone1;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i=1, j=1;
        //int k=1;
        while (i <= n) {
            while (j <= i){
                System.out.print(j+ " ");
                //System.out.print(k+ " ");
                j++;
                //k++;
            }
            System.out.println();
            j=1;
            i++;
           // k=i;
        }
        s.close();
    }

}

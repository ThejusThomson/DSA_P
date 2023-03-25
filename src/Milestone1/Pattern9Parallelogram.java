package Milestone1;

import java.util.Scanner;

public class Pattern9Parallelogram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int curRow = 1;
        while(curRow <= n) {
            int curCol = 1;
            while(curCol < curRow) {
                System.out.print(" ");
                curCol++;
            }
            curCol = 1;
            while(curCol <= n) {
                System.out.print("*");
                curCol++;
            }
            curRow++;
            System.out.println();
        }

        s.close();
    }
}

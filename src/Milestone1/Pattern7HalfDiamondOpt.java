package Milestone1;

import java.util.Scanner;

public class Pattern7HalfDiamondOpt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int firstHalf = n+1;
        int curRow = 1;
        if(n == 0) {
            System.out.println("*");
        }
        while(curRow <= firstHalf) {
            if (curRow > 1) {
                System.out.print("*");
            }
            int curCol = 1;
            while(curCol <= curRow-1) {
                System.out.print(curCol);
                curCol++;
            }
            curCol-=2;
            while(curCol >= 1) {
                System.out.print(curCol);
                curCol--;
            }
            System.out.print("*");
            curRow++;
            System.out.println();
        }
        curRow-=2;
        while (curRow >= 1) {
            if (curRow > 1) {
                System.out.print("*");
            }
            int curCol2 = 1;
            while (curCol2 <= curRow-1) {
                System.out.print(curCol2);
                curCol2++;
            }
            curCol2-=2;
            while(curCol2 >= 1) {
                System.out.print(curCol2);
                curCol2--;
            }
            System.out.print("*");
            curRow--;
            System.out.println();
        }

        s.close();
    }
}

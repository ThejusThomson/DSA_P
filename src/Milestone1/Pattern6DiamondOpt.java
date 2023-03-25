package Milestone1;

import java.util.Scanner;

public class Pattern6DiamondOpt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int firstHalf = (n+1)/2;
        int secondHalf = n/2;

        int currentRow = 1;

        while(currentRow <= firstHalf) {
            int spaces = 1;
            while (spaces <= firstHalf - currentRow) {
                System.out.print(" ");
                spaces++;
            }
            int curCol = 1;
            while (curCol <= (currentRow * 2) - 1) {
                System.out.print("*");
                curCol++;
            }
            currentRow++;
            System.out.println();
        }
        currentRow = secondHalf;
        while (currentRow >= 1) {
            int spaces = 1;
            while (spaces <= secondHalf - currentRow +1) {
                System.out.print(" ");
                spaces++;
            }
            int curCol = 1;
            while (curCol <= currentRow*2 - 1) {
                System.out.print("*");
                curCol++;
            }
            currentRow--;
            System.out.println();
        }

        s.close();
    }
}

package Milestone1;

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int curRow = 1;
        while(curRow <= n) {
            int curCol = 1;
            int printVal = 2*curRow - 1;
            while(curCol <= n) {
                System.out.print(printVal);
                printVal+=2;
                if(printVal > 2*n)
                    printVal = 1;
                curCol++;
            }
            curRow++;
            System.out.println();
        }
        s.close();
    }
}

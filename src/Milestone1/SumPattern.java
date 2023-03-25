package Milestone1;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int curRow = 1;
        while(curRow <= n) {
            int sum = 1;
            System.out.print("1");
            int curItr = 2;
            while(curItr <= curRow)	{
                System.out.print("+"+curItr);
                sum+=curItr;
                curItr++;
            }
            System.out.print("="+sum);
            System.out.println();
            curRow++;
        }
        s.close();
    }
}

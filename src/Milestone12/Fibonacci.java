package Milestone12;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = 1;
        int n2 = 1;
        int temp = 0, i = 0;
        for (i = 0; i < n-2; i++) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n2);
    }
}

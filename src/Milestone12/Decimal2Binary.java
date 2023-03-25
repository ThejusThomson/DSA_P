package Milestone12;

import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String bin = "";
        if(n == 0) {
            bin = "0";
        }
        while (n > 0) {
            int b = n % 2;
            bin = b + bin;
            n /= 2;
        }
        System.out.println(bin);
    }
}

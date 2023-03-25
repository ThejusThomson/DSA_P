package Milestone1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Double a,b;
//        a=s.nextDouble();
//        b=s.nextDouble();
//        System.out.println(a+b);
        int a = s.nextInt();
        String st = s.next();
        System.out.println(a+st);
        s.close();
    }
}

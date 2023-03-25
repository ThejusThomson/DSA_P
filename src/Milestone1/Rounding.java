package Milestone1;

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc =  new Scanner(System.in);
        int b = sc.nextInt();
        String r = sc.next();
        char gr = r.charAt(0);
        int al;
        if(gr=='A')
            al = 1700;
        else if(gr=='B')
            al = 1500;
        else
            al=1300;
        double hra=0.2*b;
        double da=0.5*b;
        double pf=0.11*b;

        double total = b+hra+da+al-pf;

//        int rtotal = (int) total;
//        double temp = total%1;
//        if(temp>=0.5)
//            rtotal=rtotal+1;
        int rtotal = (int) Math.round(total);
        System.out.println(rtotal);
        sc.close();
    }
}

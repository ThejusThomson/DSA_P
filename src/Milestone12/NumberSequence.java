package Milestone12;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }
        boolean isSeq = false;
        int j = 0;
        while (j < n-1){
            if(arr[j] > arr[j+1]) {
                j++;
            }
            else
                break;
        }
        while (j < n -1) {
            if (arr[j] < arr[j+1]) {
                j++;
            }
            else
                break;
        }
        if(j == n-1) {
            isSeq = true;
        }
        System.out.println(isSeq);
    }
}

package Milestone2;

public class Sort01 {
    public static void printArr(int[] brr) {
        for(int i=0; i<brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
        int zc=0, oc=0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i]==0) {
                zc++;
            }
            else {
                oc++;
            }
        }
        for(int j=0; j<zc; j++) {
            arr[j]=0;
        }
        for(int k=zc; k<zc+oc; k++) {
            arr[k]=1;
        }
    }

    public static void main(String[] args) {
        int a [] = {0,1,0,1,0,1,0,0,1,1};
        sortZeroesAndOne(a);
        printArr(a);
    }
}

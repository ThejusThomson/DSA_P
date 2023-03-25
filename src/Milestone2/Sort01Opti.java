package Milestone2;

public class Sort01Opti {
    public static void printArr(int[] brr) {
        for(int i=0; i<brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
    public static void sortZeroesAndOne(int[] arr) {
        int zc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[zc];
                arr[zc] = arr[i];
                arr[i]=temp;
                zc++;
            }
        }
    }


    public static void main(String[] args) {
        int a [] = {1,1,1,1,0,1,0,0,1,1};
        sortZeroesAndOne(a);
        printArr(a);
    }
}

package Milestone21;

public class BinarySearch {

    public static void printArr(int[] brr) {
        for(int i=0; i<brr.length; i++) {
            System.out.print(brr[i]+" ");
        }
    }
    public static void binarySearch(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element found at: ");
        }
    }
    public static void main(String[] args) {
        int a [] = {1,1,1,1,0,1,0,0,1,1};
        int f = 4;
        printArr(a);
    }
}

package Milestone2;

public class Array {
    public static void printArr(int[] brr) {
        for(int i=0; i<brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
    public static int[] incArr(int[] arr) {
        arr = new int[3];
        for(int i=0; i<arr.length; i++) {
            arr[i]+=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println(a);
        //incArr(a);
        a = incArr(a);
        printArr(a);
    }
}

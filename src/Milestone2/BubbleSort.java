package Milestone2;

import java.util.Scanner;

public class BubbleSort {

    public static void printArr(int[] a) {
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int size = s.nextInt();
        int[] arr  = new int[size];
        for(int i=0; i<size; i++) {
            System.out.println("Element at  index "+i+" is:");
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        for (int i=1; i<size; i++) {
            for (int j=0; j<size-i; j++) {
               if(arr[j] > arr[j+1]) {
                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
               }
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {125,121,93,83,67,53,32,21,17,9,5,2,1};
        //int[] a = takeInput();
        bubbleSort(a);
        printArr(a);
        System.out.println(a);
    }
}

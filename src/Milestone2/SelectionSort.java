package Milestone2;

import java.util.Scanner;

public class SelectionSort {

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

    public static void selectionSort(int[] arr) {
        int size = arr.length, minInx=0;
        for (int i=0; i<size; i++) {
            int min = Integer.MAX_VALUE;
            for (int j=i; j<size; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minInx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minInx];
            arr[minInx] = temp;
        }
    }


    public static void main(String[] args) {
        int[] a = {125,121,93,83,67,53,32,21,17,9,5,2,1};
        //int[] a = takeInput();
        selectionSort(a);
        printArr(a);
        System.out.println(a);
    }
}

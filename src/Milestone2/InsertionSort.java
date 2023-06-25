package Milestone2;

import java.util.Scanner;

public class InsertionSort {
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

    public static void insertionSort(int[] arr) {
        int si = arr.length;
        for(int i=1; i<si; i++) {
           int temp = arr[i];
           int j = i-1;
           while (j >= 0 && arr[j] > temp) {
               //moving all elements to the right
               arr[j+1] = arr[j];
               j--;
           }
           //when temp is greater you are inserting at index+1 element
           arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = {125,121,93,83,67,53,32,21,17,9,5,2,1};
        //int[] a = takeInput();
        insertionSort(a);
        printArr(a);
        System.out.println(a);
    }
}

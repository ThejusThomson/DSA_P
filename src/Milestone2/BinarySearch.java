package Milestone2;

import java.util.Scanner;

public class BinarySearch {

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
    public static int binarySearch(int[] arr, int x) {
        //Your code goes here
        int left=0, right=arr.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] == x) {
                return mid;
            }
            else if(x > arr[mid]) {
                left = mid+1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr =  takeInput();
        System.out.println("Enter element to be search: ");
        int x = s.nextInt();
        System.out.println("Element found at: "+binarySearch(arr,x));
    }
}

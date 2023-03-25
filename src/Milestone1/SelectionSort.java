package Milestone1;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1,5,-1,10,-12,-47,78,0};
        int itr;
        int max = array[0];
        for(itr=1; itr<array.length-1; itr++) {
            if(array[itr]>max) {
                swap(array,1,2);
            }
        }
    }
    static void swap(int [] arr,int i, int max) {
        int tmp = arr[i];
    }
}

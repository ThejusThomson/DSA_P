package Milestone1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = new int[6];
        intArray[0]=1;
        intArray[1]=-1;
        intArray[2]=189;
        intArray[3]=-29;
        intArray[4]=43;
        intArray[5]=0;
        int i;
        int j;
        for(i=0; i<intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
        for(j=0; j<intArray.length-1; j++) {
            for (i = 0; i < intArray.length-j-1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray,i);
                }
            }
        }
        System.out.println("\nBubble Sorted Array is:");
        for (i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
}

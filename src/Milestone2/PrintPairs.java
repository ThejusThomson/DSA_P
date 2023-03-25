package Milestone2;

public class PrintPairs {

    public static void printPairs(int [] a) {
        for (int i=0; i< a.length; i++) {
            for (int j = i+1; j<a.length;j++) {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 8};
        printPairs(a);
    }
}

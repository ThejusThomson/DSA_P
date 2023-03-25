package Milestone2;

public class FindUnique {
    public static int findUnique(int[] arr){
        //Your code goes here
        int n =  arr.length;
        for(int i=0; i<n; i++) {
            int occ = 0;
            for(int j=0; j<n; j++) {
                if(arr[i]==arr[j]){
                    occ++;
                }
            }
            if(occ==1) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] a = {1, 3, 1, 3, 6, 6, 7, 10, 7};
        System.out.println(findUnique(a));
    }
}

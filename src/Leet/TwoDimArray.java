package Leet;

public class TwoDimArray {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,5},{3,2,1}};
        int row = accounts.length;
        int col = accounts[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0;  i<row; i++) {
            int sum = 0;
            for(int j=0; j<col; j++) {
                sum = sum + accounts[i][j];
            }
            if(sum > max)
                max = sum;
        }
        System.out.println(max);
    }
}

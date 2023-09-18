package Leet;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int [] sumArr = new int[nums.length];
        int sum = 0;
        for(int i=0; i< nums.length; i++) {
            sum = sum + nums[i];
            sumArr[i] = sum;
        }
        for (int i=0; i<sumArr.length;i++) {
            System.out.println(sumArr[i]);
        }
    }
}

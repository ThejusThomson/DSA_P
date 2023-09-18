package Leet;

public class LeftAndRightDiff {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] res = new int[nums.length];
        int lSum = 0, rSum = 0; //lSum=j, rSum =k

        for(int j=0, k=nums.length-1; j< nums.length && k >=0; j++, k--) {
            leftSum[j] = lSum;
            lSum += nums[j];
            rightSum[k] = rSum;
            rSum += nums[k];
        }
        for(int k=0; k< res.length; k++) {
            System.out.print("left: "+leftSum[k]);
            System.out.println(" right: "+rightSum[k]);
        }
        for(int k=0; k< res.length; k++) {
            res[k] = Math.abs(leftSum[k]-rightSum[k]);
            System.out.println(res[k]);
        }
    }
}

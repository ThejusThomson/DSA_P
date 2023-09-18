package Leet;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int [] countLst = new int[nums.length];
        for(int i=0; i<nums.length;i++) {
            int count = 0;
            for (int j=0; j<nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count++;
                }
                countLst[i] = count;
            }
            countLst[i] = count;
        }
        for(int i=0; i<countLst.length; i++) {
            System.out.println(countLst[i]);
        }
    }

}

package Leet;

public class GoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        int gp = 0;
        for(int i=0; i< nums.length;i++) {
            for (int j=i+1;j< nums.length;j++) {
                if(nums[i]==nums[j])
                    gp++;
            }
        }
        System.out.println(gp);
    }
}

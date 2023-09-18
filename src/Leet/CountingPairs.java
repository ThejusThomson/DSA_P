package Leet;

import java.util.ArrayList;
import java.util.List;

public class CountingPairs {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int target = 3,count=0;
        for(int i=0; i<nums.size(); i++) {
            for(int j=i+1; j<nums.size();j++) {
                if(nums.get(i)+nums.get(j)>target)
                    count++;
            }
        }
        System.out.println(count);
    }
}

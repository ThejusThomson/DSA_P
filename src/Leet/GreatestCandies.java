package Leet;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++) {
            if(candies[i]>max)
                max = candies[i];
        }
        for(int j=0; j<candies.length; j++) {
            list.add(candies[j]+extraCandies >= max);
        }
        System.out.println(list);
    }
}

package Leet;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.merge(i, 1, Integer::sum);//For Getting Frequency
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> Integer.compare(map.get(b), map.get(a) ) ); //Sort by Frequency in descending order
        int[] res = new int[k];
        System.out.println(list);
        for (int i = 0; i < k; ++i)
            res[i] = list.get(i);
        return res;
    }
}

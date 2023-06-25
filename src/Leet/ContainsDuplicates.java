package Leet;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6};
        int siz = arr.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i< siz; i++) {
            if(map.containsKey(arr[i])) {
                System.out.println("true");
                return;
            }
            else {
                map.put(arr[i],i);
            }
        }
        System.out.println("false");
    }

}

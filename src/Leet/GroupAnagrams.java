package Leet;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringMap = new HashMap<>();
        for (String str : strs) {
            char[] charS = str.toCharArray();
            Arrays.sort(charS);
            String sortedStr = new String(charS);
            if (!stringMap.containsKey(sortedStr)) {
                stringMap.put(sortedStr, new ArrayList<>());
            }
            stringMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(stringMap.values());
    }
}

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int cur = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {

                if ((i - cur) > map.get(c)) {
                    map.put(c, i);
                    cur++;
                } else {
                    cur = i - map.get(c);
                    map.put(c, i);
                }
            } else {
                map.put(c, i);
                cur++;
            }

            max = Math.max(cur, max);
        }

        return max;
    }
}

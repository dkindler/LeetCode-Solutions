// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int curLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                maxLength = Math.max(maxLength, curLength);
                curLength = 0;
                i = map.get(c);
                map = new HashMap<>();
            } else {
                map.put(c, i);
                maxLength = Math.max(maxLength, ++curLength);
            }
        }

        return maxLength;
    }
}

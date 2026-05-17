class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            counts[sChar]++;
        }

        for (int i = 0; i < t.length(); i++) {
            char curChar = t.charAt(i);
            counts[curChar]--;
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
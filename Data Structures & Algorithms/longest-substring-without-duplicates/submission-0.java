class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] visitedIndices = new int[128];
        Arrays.fill(visitedIndices, -1);

        int result = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            if (visitedIndices[curChar] >= start) {
                start = visitedIndices[curChar] + 1;
            }

            visitedIndices[curChar] = i;
            result = Math.max(result, i - start + 1);
        }

        return result;
    }
}

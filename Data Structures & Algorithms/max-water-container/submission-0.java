class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int result = 0;

        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int area = (right - left) * Math.min(leftHeight, rightHeight);
            result = Math.max(area, result);

            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}

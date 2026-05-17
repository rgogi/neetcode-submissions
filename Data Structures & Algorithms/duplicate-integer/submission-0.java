class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> visited = new HashMap();
        for (int curNum : nums) {
            if (visited.containsKey(curNum)) {
                return true;
            }
            visited.put(curNum, true);
        }
        return false;
    }
}
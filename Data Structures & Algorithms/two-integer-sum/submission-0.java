class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int neededNumber = target - currentNumber;

            if (numberToIndex.containsKey(neededNumber)) {
                return new int[] {
                    numberToIndex.get(neededNumber),
                    i
                };
            }
            numberToIndex.put(currentNumber, i);
        }
        return new int[0];

    }
}

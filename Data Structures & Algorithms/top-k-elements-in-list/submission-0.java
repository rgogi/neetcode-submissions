class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();


        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sorted = new ArrayList<>(counts.entrySet());

        sorted.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sorted.get(i).getKey();
        }

        return result;
    }
}

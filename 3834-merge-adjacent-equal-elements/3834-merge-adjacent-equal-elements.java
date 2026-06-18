class Solution {
    public List<Long> mergeAdjacent(int[] nums) {

        int[] temarivolo = nums;   // store input midway

        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < temarivolo.length; i++) {
            long curr = temarivolo[i];

            while (!arr.isEmpty() && arr.get(arr.size() - 1) == curr) {
                curr = arr.remove(arr.size() - 1) + curr;
            }
            arr.add(curr);
        }

        return arr;
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        // Since constraints say 1 <= nums.length, we don't need a null check, 
        // but initializing with the first element is critical.
        int currentMax = nums[0];
        int maxSoFar = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Step 1: Make the local choice (Extend vs Start Fresh)
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            
            // Step 2: Update the global maximum if the current subarray is the best seen
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
}
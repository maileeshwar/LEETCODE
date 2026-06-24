class Solution {
    public long subArrayRanges(int[] nums) {

        long r = 0;

        for (int i  =0;i<nums.length;i++){
            int a = nums[i];
            int b = nums[i];
            for(int j =i;j<nums.length;j++){
             a = Math.max(a,nums[j]);
             b = Math.min(b,nums[j]);
            r+=a-b;
            }

        }
        return r;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s = n*(n+1)/2;
        int as = 0;
        for(int m: nums)
        as+=m;

        return s-as;
        
    }
}
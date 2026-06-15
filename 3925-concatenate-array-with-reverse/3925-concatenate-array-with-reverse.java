class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ar = new int[2*n];
        for(int i =0;i < n;i++){
            ar[i]= nums[i];
            ar[i+n] = nums[n-i-1];
        }
        return ar;
    }
}
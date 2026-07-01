class Solution {
    public int centeredSubarrays(int[] nums) {
        int c =0;
        //int sum = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
        Set <Integer> set = new HashSet<>();
        int sum =0;
            for(int j = i;j<n;j++){
                sum += nums[j];
                set.add(nums[j]);

            
            if(set.contains(sum)) c++;
        }
        }      
        return c;
    }
}
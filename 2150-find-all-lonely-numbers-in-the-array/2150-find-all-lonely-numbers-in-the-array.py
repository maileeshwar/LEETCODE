class Solution(object):
    def findLonely(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        A=Counter(nums)
        r=[]
        for i in range(len(nums)):
            x=nums[i]
            a=nums[i]+1
            b=nums[i]-1
            if a not in A and b not in A and A[x] ==1:
                r.append(nums[i])
        return r
        
class Solution(object):
    def maximumPossibleSize(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        a =0
        b =0
        for i in nums:
            if i>=b:
                b=i
                a+=1
        return a
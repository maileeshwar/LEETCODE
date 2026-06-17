class Solution(object):
    def doesAliceWin(self, s):
        """
        :type s: str
        :rtype: bool
        """
        v= ['a','e','i','o','u']
        for i in s:
            if i in v:
                return True
        return False
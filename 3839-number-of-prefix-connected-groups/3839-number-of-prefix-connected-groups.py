class Solution(object):
    def prefixConnected(self, words, k):
        """
        :type words: List[str]
        :type k: int
        :rtype: int
        """
        a=[w[:k] for w in words if len(w) >=k]
        b=Counter(a)
        c=sum(1 for i in b.values() if i>=2)
        return c
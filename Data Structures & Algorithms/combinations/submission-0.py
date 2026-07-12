class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        combs = []
        self.helper(1,[],combs,n,k)

        return combs

    def helper(self, i, curr, combs, n, k):
        if len(curr) == k:
            combs.append(curr[:])
            return
        if i > n:
            return
        
        curr.append(i)
        self.helper(i+1, curr, combs, n, k)

        curr.pop()
        self.helper(i+1, curr, combs, n, k)
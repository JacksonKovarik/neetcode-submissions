class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        combs = []

        def dfs(i,curr):
            if i > n+1: return
            if len(curr) == k:
                combs.append(curr[:])
                return
            curr.append(i)
            dfs(i+1,curr)
            
            curr.pop()
            dfs(i+1,curr)
        
        dfs(1,[])
        return combs
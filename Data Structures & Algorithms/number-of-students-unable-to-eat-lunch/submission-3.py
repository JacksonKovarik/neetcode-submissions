class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        res = len(sandwiches)
        cnt = {0: 0, 1: 0}

        for i in students:
            cnt[i] += 1

        for s in sandwiches:
            if cnt[s] <= 0:
                break
            cnt[s] -= 1
            res -= 1
            
        return res
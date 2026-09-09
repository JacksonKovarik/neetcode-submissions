class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        count0 = 0
        count1 = 0

        for i in students:
            if i == 1:
                count1 += 1
            else:
                count0 += 1
        
        for s in sandwiches:
            if s == 0:
                if count0 == 0:
                    break
                count0 -= 1
            elif s == 1:
                if count1 == 0:
                    break
                count1 -= 1
        
        return count0 + count1
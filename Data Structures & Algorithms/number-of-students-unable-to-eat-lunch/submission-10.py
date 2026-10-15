class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        students = deque(students)
        studentCounter = Counter(students)
        sandwichCounter = Counter(sandwiches)
        print(studentCounter)
        count = 0
        while count < len(sandwiches):
            if students[0] == sandwiches[count]:
                studentCounter[students[0]] -= 1
                sandwichCounter[sandwiches[count]] -= 1
                students.popleft()
                count += 1
            elif studentCounter[sandwiches[count]] == 0:
                break
            else:
                val = students.popleft()
                students.append(val)
                
        return len(sandwiches)-count
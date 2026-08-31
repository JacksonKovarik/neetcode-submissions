class Solution:
    def isValid(self, s: str) -> bool:
        pairs = {
            ')': '(',
            '}': '{',
            ']': '['
        }

        stack = []

        for i in s:
            if not stack:
                stack.append(i)
            elif i in pairs:
                if pairs[i] != stack[-1]:
                    return False
                elif pairs[i] == stack[-1]:
                    stack.pop()
            else: 
                stack.append(i)
        return len(stack) == 0
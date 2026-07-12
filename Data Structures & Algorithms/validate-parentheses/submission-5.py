class Solution:
    def isValid(self, s: str) -> bool:
        # Using a stack, whenever a reverse bracket shows up, check
        # to make sure that the most recent char on the stack is the 
        # corresponding open bracket

        # How to know which bracket goes with which?
            # Using a map to map the closed brackets (because we will
            # check the map to see if the char given is a closed bracket)
            # to the corresponding open bracket
        assign = {
            ')': '(',
            '}': '{',
            ']': '['
        }

        stack = []

        for i in s:
            if i not in assign:
                stack.append(i)
            else:
                if len(stack) >=1 and stack[-1] == assign.get(i):
                    stack.pop();
                else:
                    return False;

        return len(stack) == 0
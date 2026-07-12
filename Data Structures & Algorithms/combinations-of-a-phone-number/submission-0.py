class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        combs = []
        digitToChar = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "qprs",
            "8": "tuv",
            "9": "wxyz",
        }

        # For every integer INORDER, create all possible letter combinations
        # Decision Path of size len(digitToChar[digit[i]])
        # "3,4" == "DEF","GHI"

        def helper(i,curr):
            if len(curr) == len(digits):
                combs.append(curr)
                return

            
            for c in digitToChar[digits[i]]:
                curr += c
                helper(i+1,curr)
                curr = curr [:-1]
        
        helper(0,"")
        return combs

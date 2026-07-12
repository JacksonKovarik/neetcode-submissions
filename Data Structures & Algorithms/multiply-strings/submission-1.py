class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        if num1 == "0" or num2 == "0": return "0"
        valid_num1 = self.getNumFromString(num1)
        valid_num2 = self.getNumFromString(num2)
        return self.getStringFromNum(valid_num1*valid_num2)
    
    def getNumFromString(self, s: str) -> int:
        nums = {
            '0': 0,
            '1': 1,
            '2': 2,
            '3': 3,
            '4': 4,
            '5': 5,
            '6': 6,
            '7': 7,
            '8': 8,
            '9': 9
        }

        valid_num = 0
        curr_digit = len(s)-1
        for i in s:
            multiplier = 10 ** curr_digit
            valid_num += multiplier*nums[i]
            curr_digit -= 1

        return valid_num
    
    def getStringFromNum(self, num: int) -> str:
        nums = {
            0: '0',
            1: '1',
            2: '2',
            3: '3',
            4: '4',
            5: '5',
            6: '6',
            7: '7',
            8: '8',
            9: '9'
        }
        strNum = ""

        while num > 0:
            n = num % 10
            strNum += nums[n]

            num = num // 10
        
        valid_string = ""

        for i in reversed(strNum):
            valid_string += i

        return valid_string
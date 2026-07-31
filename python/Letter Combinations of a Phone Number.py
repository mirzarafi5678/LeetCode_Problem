from typing import List


class 1_two_sum.src.1_two_sum.valid_soduku.no_23_marged_K_sorted_list.Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []

        phone = {
            "2": "abc", "3": "def", "4": "ghi",
            "5": "jkl", "6": "mno", "7": "pqrs",
            "8": "tuv", "9": "wxyz"
        }

        result = []

        def backtrack(index, path):
            if index == len(digits):
                result.append(path)
                return

            letters = phone[digits[index]]
            for letter in letters:
                backtrack(index + 1, path + letter)

        backtrack(0, "")
        return result


ss= 1_two_sum.src.1_two_sum.valid_soduku.no_23_marged_K_sorted_list.Solution()
ss.letterCombinations("23")
print(ss.letterCombinations(""))
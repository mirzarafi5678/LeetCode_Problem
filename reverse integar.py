class Solution:
    def reverse(self, x: int) -> int:

        sign = -1 if x < 0 else 1
        y = abs(x)
        rev = 0
        while y != 0:
            digit = y % 10
            rev = rev * 10 + digit
            y //= 10
        rev = sign * rev
        if rev < -2 ** 31 or rev > 2 ** 31 - 1:
            return 0
        return rev


ss = Solution()
print(ss.reverse(-1534236469))
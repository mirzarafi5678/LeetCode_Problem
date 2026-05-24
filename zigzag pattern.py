class Solution:
    def convert(self, s: str, numRows: int) -> str:
        row = [""] * numRows
        current = 0
        direction = -1
        if numRows == 1 or numRows >= len(s):
            return s

        for i in range(len(s)):
            row[current] += s[i]

            if current == 0 or current == numRows - 1:
                direction *= -1
            current += direction
        return "".join(row)


ss = Solution()
aa = ss.convert("paypalishiring", 3)
print(aa)
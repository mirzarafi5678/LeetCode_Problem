class Solution:
    def maxArea(self, height) -> int:
        maxArea = 0
        l = 0
        r = len(height) - 1

        while l < r:
            width = r - l
            wall = min(height[l], height[r])
            area = width * wall
            maxArea = area if area > maxArea else maxArea

            if (height[l] < height[r]):
                l = l + 1
            else:
                r = r - 1
        return maxArea


SS = Solution()
print(SS.maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7]))
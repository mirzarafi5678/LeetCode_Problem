class Solution :
  def expand (self , s, l, r) ->str :
        while    l >= 0 and r <len(s) and s[l]== s[r]:
          l = l-1
          r= r+1
        return s[l+1: r]


  def longestPalindrome (self , s : str) -> str :
    longest =""
    len1= len(s)
    for i in range(len1):
      odd = self.expand (s, i , i)
      even = self.expand (s, i , i+1)
      if len(odd) <= len(even) :
        longest = even if len(even) >= len(longest) else longest
      else :
        longest = odd if len(odd) >=len(longest) else longest
    return longest


ss = Solution()
print(ss.longestPalindrome("aabbaa"))
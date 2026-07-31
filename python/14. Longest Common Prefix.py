class 1_two_sum.src.1_two_sum.valid_soduku.no_23_marged_K_sorted_list._34_problem.Solution:
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""

    class 1_two_sum.src.1_two_sum.valid_soduku.no_23_marged_K_sorted_list._34_problem.Solution:
     def longestCommonPrefix(self, strs):
        if not strs:
            return ""

        strs.sort()

        first = strs[0]
        last = strs[-1]

        i = 0
        while i < len(first) and i < len(last) and first[i] == last[i]:
            i += 1

        return first[:i]

        first = strs[0]
        last = strs[-1]

        i = 0
        while i < len(first) and i < len(last) and first[i] == last[i]:
            i += 1

        return first[:i]
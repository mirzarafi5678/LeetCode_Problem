class 1_two_sum.src.1_two_sum.valid_soduku.no_23_marged_K_sorted_list._34_problem.Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []

        for ch in s:
            if ch == '(' or ch == '{' or ch == '[':
                stack.append(ch)
            else:
                if not stack:
                    return False

                top = stack.pop()

                if (ch == ')' and top != '(') or \
                   (ch == ']' and top != '[') or \
                   (ch == '}' and top != '{'):
                    return False

        return len(stack) == 0
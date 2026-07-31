class 1_two_sum.src.1_two_sum.valid_soduku.no_23_marged_K_sorted_list._34_problem.Solution:
    def intToRoman(self, num: int) -> str:
        values = [1000, 900, 500, 400,
              100, 90, 50, 40,
              10, 9, 5, 4, 1]

        romans = ["M", "CM", "D", "CD",
              "C", "XC", "L", "XL",
              "X", "IX", "V", "IV", "I"]


        result = ""

        for i in range(len(values)):
           while num >= values[i]:
             result += romans[i]
             num -= values[i]

        return result

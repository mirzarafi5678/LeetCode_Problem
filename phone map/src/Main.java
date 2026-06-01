import java.util.*;

class Solution {

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        Map<Character, String> phone = new HashMap<>();
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");

        List<String> result = new ArrayList<>();

        backtrack(0, "", digits, phone, result);

        return result;
    }

    private void backtrack(int index, String path, String digits,
                           Map<Character, String> phone,
                           List<String> result) {

        if (index == digits.length()) {
            result.add(path);
            return;
        }

        String letters = phone.get(digits.charAt(index));

        for (char letter : letters.toCharArray()) {
            backtrack(index + 1, path + letter, digits, phone, result);
        }
    }

    public static void main(String[] args) {
        Solution ss = new Solution();

        System.out.println(ss.letterCombinations("23"));

    }
}
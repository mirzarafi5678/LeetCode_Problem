class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();


        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) return 0;


        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }


        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';


            if ( result > 214748364 ||(result == 214748364 && digit > 7)) {
                return sign == 1 ? 2147483647 : -2147483648;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
public class Main {
    public static void main(String[] args) {

        }

}

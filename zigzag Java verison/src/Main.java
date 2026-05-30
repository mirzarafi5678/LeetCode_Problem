class Solution {

    public String convert(String s, int numRows){
        StringBuilder[] rows = new StringBuilder[numRows];

        if (numRows < s.length() && numRows ==1){
            return s;
        }

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int current =0 ;
        int direction = -1;

        for (int i = 0; i < s.length(); i++) {
            rows[current].append(s.charAt(i));
            if (current == 0 || current == (numRows-1)) {
               direction *= -1;
            }
            current +=direction;
        }

        StringBuilder result = new StringBuilder();
        for (  StringBuilder r : rows) {
            result.append(r);

        }

        return result.toString();
    }



}








public class Main {


}

class Solution {
    public int strStr(String haystack, String needle) {

        int j = 0;
        int start = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                 if (j==0) {
                     start = i;
                 }
                 if (j == needle.length()-1){
                     return start;
                 }
                 j++;


            }else {
                if (j>0){
                    i = start;
                    j=0;
                    start=-1;
                }

            }
        }


        return -1;
    }
}


public class Main2 {
}

import java.util.HashSet;

import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> sett = new HashSet<>();
        int longest = 0;
        int n=  s.length();
        int r =0 ;
        int l= 0;
        for (int i  =  0; i <n ; r++) {
            r=i;
            while ( sett.contains(s.charAt(r)) ) {
                sett.remove( s.charAt(l));
                l++;
            }

            i++;
            sett.add(s.charAt(r));


            longest= Math.max(longest, (r-l+1));

        }
        return longest;
    }




}




public class Main {
    public static void main(String[] args) {

        Solution ss = new Solution();

        System.out.println(ss.lengthOfLongestSubstring("abcabccc"));

        }

}

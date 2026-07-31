import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        int count = 0;

        while (i < len){
            int j=i+1;
            if (j> len-1) {break;}
            int innerCount=0;
            while ( nums[i] == nums[j]  ){
                count++;
                innerCount++;
                nums[j]= nums[len-1];
                j++;
                if (j> len-1) {break;}


            }
            i=i+innerCount+1;

       }
       Arrays.sort(nums);

       return len-count;
    }
}


public class Main {

    public static void main(String[] args) {
        int[] nums = {1,1};
        Solution ss = new Solution();
        System.out.println(ss.removeDuplicates(nums));
    }
}
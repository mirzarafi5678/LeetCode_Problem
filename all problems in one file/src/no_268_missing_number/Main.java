package no_268_missing_number;

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
       int i = 0;
       while ( i < nums.length){

           if (nums[i]< nums.length  && i != nums[i]){
               swap (nums, i ,nums[i]);

           }else {
               i++;
           }

       }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]){
                return j ;
            }
        }



        return nums.length;
    }
    void swap (int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}




public class Main {
    public static void main(String[] args) {
        Solution ss = new Solution();
        int [] arr = {5,2,1,0,4};
        ss.missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }
}

package problem_448_find_all_numbers_disappeared_in_array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while ( i < nums.length){
            int correct = nums[i]-1;
            if (nums[i]<= nums.length  && nums[i] != nums[correct]){
                swap(nums, i, correct);

            }else {
                i++;
            }

        }
        List <Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]!= j+1){
                ans.add(j+1);

            }
        }
        return ans;

    }

    void swap (int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}




public class _no_448 {


}


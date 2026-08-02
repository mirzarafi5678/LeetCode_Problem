package problem_46_permutation;

import java.util.ArrayList;
import java.util.List;

class Solution2{
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permuteHelper(0,nums,ans);

        return ans;

    }
    private void permuteHelper  (int j,int[] nums, List<List<Integer>> ans){
        if (j==nums.length){
            List <Integer> temp = new ArrayList<>();
            for (int n : nums){
                temp.add(n);
            }

            ans.add(new ArrayList<>(temp));

            return;


        }

        for (int i = j; i < nums.length; i++) {
            swap(i,j,nums);
            permuteHelper(j+1,nums,ans);
            swap(i, j , nums);
        }



    }
    private void swap (int i , int j , int[]nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;

    }

}
public class permutation2 {

 static Solution2 ss = new Solution2();

    public static void main(String[] args) {
        System.out.println(ss.permute(new int[] {1,2,3}));
    }
}


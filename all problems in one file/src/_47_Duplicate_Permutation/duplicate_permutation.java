package _47_Duplicate_Permutation;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List <List<Integer>> ans = new ArrayList<>();
        List <Integer> ds  = new ArrayList<>();
        boolean [] freq = new boolean [nums.length];
        backTrackPermute(nums, ds, ans, freq);
        return ans;


    }
    private void backTrackPermute (int[] nums , List<Integer> ds , List<List<Integer>> ans, boolean[] freq ){
        if (ds.size()== nums.length){
            ans.add(new ArrayList<>(ds));
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(freq[i] || i > 0 && nums[i] == nums[i-1] && !freq[i - 1]) continue;
                freq[i] = true;
                ds.add(nums[i]);
                System.out.println(ds);
                backTrackPermute(nums, ds , ans, freq);
                freq[i] = false;
                ds.removeLast();


        }
    }
}

public class duplicate_permutation {
}

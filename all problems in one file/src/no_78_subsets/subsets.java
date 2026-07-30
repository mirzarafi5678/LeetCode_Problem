package no_78_subsets;

import java.util.ArrayList;
import java.util.List;

public class subsets {
}

class test {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current= new ArrayList<>();
        backtrack(nums, 0, current, result);

        System.out.println(result);
    }

    static void backtrack(int[] nums, int index,
                          List<Integer> current,
                          List<List<Integer>> result) {


        result.add(new ArrayList<>(current));


        for (int i = index; i < nums.length; i++) {



            current.add(nums[i]);


            backtrack(nums, i + 1, current, result);


            current.removeLast();
        }
    }
}
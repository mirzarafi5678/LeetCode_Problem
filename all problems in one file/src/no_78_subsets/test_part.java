package no_78_subsets;

import java.util.*;

public class test_part {
    public static void main(String[] args) {
        Main.main(new String[0]);

    }
}
class Main {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private static void dfs(int index, int[] nums, List<Integer> curr, List<List<Integer>> ans) {
        if (index == nums.length) {
            System.out.println(curr);
            ans.add(new ArrayList<>(curr));

            return;
        }

        curr.add(nums[index]);


        dfs(index+1 , nums, curr, ans);

        curr.remove(curr.size() - 1);
        while (index +1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }


        dfs(index+1 , nums, curr, ans);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter size: ");
//        int n = sc.nextInt();

        int[] nums = {1,2,2};


        System.out.print("Enter elements: ");
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }

        List<List<Integer>> result = subsets(nums);

        System.out.println("Subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

        sc.close();
    }
}
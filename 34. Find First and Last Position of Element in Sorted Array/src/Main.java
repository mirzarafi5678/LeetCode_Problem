import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    int findFist(int[] nums , int target){
        int ans = -1;
        int left = 0 ;
        int right = nums.length-1;

        while (left<=right){
            int mid = left + (right- left);

            if (nums[mid]  == target ){

                  ans = mid;
                  right = mid-1;

            }
            if (nums[mid]<target){
                left=mid+1;

            }
            if (target < nums[mid]){
                right = mid-1;

            }

        }

        return ans;

    }
    int findlast(int[] nums , int target){
        int ans = -1;
        int left = 0 ;
        int right = nums.length-1;

        while (left<=right){
            int mid = left + (right- left);

            if (nums[mid]  == target ){

                ans = mid;
                left = mid+1;

            }
            if (nums[mid]<target){
                left=mid+1;

            }
            if (target < nums[mid]){
                right = mid-1;

            }

        }

        return ans;

    }

    public int[] searchRange(int[] nums, int target) {
        return new int[] {findFist(nums,target),findlast(nums,target)};
    }



}


public  class Main  {
    public static void main(String[] args) {
        Solution ss = new Solution();
        System.out.println(Arrays.toString(ss.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7)));
    }

}
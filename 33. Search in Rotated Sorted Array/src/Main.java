
class Solution {
    public int Search(int[] nums, int target) {
          int left =0 ;
          int right = nums.length-1;
          while (left <= right ){

              int mid = left + (right-left)/2;

              if (nums[mid] == target){
                 return  mid;

              }
              if (nums[left] <= nums[mid]) {
                          if ( nums[left] <= target && target < nums[mid] ){
                                         right= mid-1;
                          }
                          else {
                              left= mid +1;
                          }
              }
              else {

                  if ( nums[mid] < target && target <= nums[right] ){
                      left= mid+1;
                  }
                  else {
                      right= mid -1;

                  }
              }


              }














          return -1;

    }
}



public class Main {
    public static void main(String[] args) {
        Solution ss = new Solution();
        System.out.println(ss.Search(new int[]{5,6,10,1,2,3,4},2));
    }


}

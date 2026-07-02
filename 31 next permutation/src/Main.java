class Solution {
    public void nextPermutation(int[] nums) {

        int index = -1 ;
        int n = nums.length;
        for (int i = n-2  ; i >= 0 ; i--) {
            if ( nums[i] < nums[ i+1] ){
                index = i;
                break;
            }
        }
        if (index == -1){
            int left = 0;
            int right = n-1;
            while (left<right){
                int temp = nums[left];
                nums [left] = nums[right];
                nums [right ] = temp;

                left ++;
                right --;
            }
            return;
        }


        for (int i = n-1; i >=0 ; i--) {
            if ( nums[index]  < nums[i ]){
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        int left = index+1;
        int right = n-1;
        while (left<right){
            int temp = nums[left];
            nums [left] = nums[right];
            nums [right ] = temp;

            left ++;
            right --;



        }


    }
}




public class Main {
    public static void main(String[] args) {
        Solution ss = new Solution();
        int []nums =  {1,2,3};
        ss.nextPermutation(nums);
    }

}
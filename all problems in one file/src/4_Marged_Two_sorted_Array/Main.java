class Solution{

    float findMedianSortedArrays( int[] arr1 , int[] arr2) {
        if (arr2.length < arr1.length) {
            return findMedianSortedArrays(arr2, arr1);
        }
        int l = 0, h = arr1.length;
        while ( l <= h) {

            int m1 = (l+h) /2 ;
            int mm2 = (arr1.length + arr2.length + 1) / 2 ;

            int m2 =mm2- m1;
            int l1= m1 == 0 ? Integer.MIN_VALUE : arr1[m1-1];
            int l2= m2 == 0 ? Integer.MIN_VALUE : arr2[m2-1];
            int r1= m1 == arr1.length ? Integer.MAX_VALUE : arr1[m1];
            int r2= m2 == arr2.length ? Integer.MAX_VALUE : arr2[m2];

            if (l1 <= r2 && l2 <= r1) {
                if ((arr1.length + arr2.length) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0f;
                } else {
                    return Math.max(l1, l2);
                }
            } else if (l2 > r1) {
                l = m1 + 1;
            } else {
                h = m1 - 1;
            }
        }
        return 0.0f;
    }



}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr1 = {1,2,3,4,6,7,12,14,15};
        int[] arr2 = {2,3,4,5,21,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        System.out.println(s.findMedianSortedArrays(arr1, arr2));

        }


}

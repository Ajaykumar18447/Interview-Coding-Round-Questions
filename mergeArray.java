/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*/
package interviewCodingQuestion;


import java.util.Arrays;

public class mergeArray {
    public static void merge(int arr1[] ,int arr2[] , int m , int n){
        m = arr1.length;
        n = arr2.length;

        int res[] = new int[m+n];

        int i=0,j=0;
        while(i<n){
            if(arr1[i]==0){

            }
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                sortarr2(arr2);

            }
            i++;
        }
        System.arraycopy(arr1, 0, res, 0, m);
        System.arraycopy(arr2, 0, res, m, n);
        System.out.println(Arrays.toString(res));
    }
    public static void sortarr2(int arr2[]){
        for(int i=1;i<arr2.length;i++){
            if(arr2[i]<arr2[i-1]){
                int temp = arr2[i];
                arr2[i] = arr2[i-1];
                arr2[i-1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m = 3;
        int n=3;

        merge(arr1, arr2, m, n);
    }
    
}

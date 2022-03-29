/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
 

Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
*/
package interviewCodingQuestion;

import java.util.Arrays;

public class MAximumProduct {
    public static int maximum(int nums[]){

        int n = nums.length;
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);

        max = Math.max(max, nums[0]*nums[1]*nums[n-1]);
        max = Math.max(max, nums[n-1]*nums[n-2]*nums[n-3]);
        return max;
    }
    public static void main(String[] args) {
        int nums[] ={8,5,4,1,9};
        System.out.println(maximum(nums));
    }
    
}

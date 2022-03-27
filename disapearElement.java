/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/
package interviewCodingQuestion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class disapearElement {
    public static List<Integer> disapear(int nums[]){
        HashSet<Integer> set = new HashSet <>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int num:nums){
            set.add(num);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};

        System.out.println(disapear(nums));
    }

    
}

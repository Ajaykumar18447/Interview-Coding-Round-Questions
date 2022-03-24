/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/
package interviewCodingQuestion;

import java.util.HashSet;

public class Containsduplicate {
public static boolean duplicate(int nums[]){
    HashSet<Integer> set = new HashSet<>();
    for(int num :nums){
        set.add(num);
    }
    if(set.size()==nums.length) return false;
    else return true;
}
public static void main(String[] args) {
    int nums[] = {1,2,3,1};
    System.out.println(duplicate(nums));
}
    
}

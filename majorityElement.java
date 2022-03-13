/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
*/

package interviewCodingQuestion;

import java.util.Scanner;

public class majorityElement {
    public static int majority(int nums[]){

        int count =0;
        int candiate =0;

        for(int num :nums){
            if(count == 0){
                candiate =num;
            }
            if(num == candiate){
                count +=1;
            }else{
                count -=1;
            }
        }
        return candiate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(majority(nums));
    }
}

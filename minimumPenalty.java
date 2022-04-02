/*
return the minimum penalty
*/
package interviewCodingQuestion;

import java.util.Arrays;

public class minimumPenalty {

    public static int penalty(int nums[]){
        Arrays.sort(nums);
        int sum =0;
        for(int i=1;i<nums.length;i++){
            sum += Math.abs(nums[i]-nums[i-1]);
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,2};
        System.out.println(penalty(nums));
    }
}

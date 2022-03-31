/*
Given an integer array .check if it contain a congitous subArray having zero sum 

int nums[] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2}
output - true;
explation - [3,4,-7]
{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
*/
package interviewCodingQuestion;

public class SubArrayZero {
    public static boolean subArray(int nums[]){
                for(int i=0;i<nums.length;i++){
                    int sum = 0;
                    for(int j=i;j<nums.length;j++){
                        sum += nums[j];

                        if(sum ==0){
                            return true;
                        }
                    }
                }
                return false;
            }
            public static void main(String[] args) {
                int nums[] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

                System.out.println(subArray(nums));
            }

    
}

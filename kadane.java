package interviewCodingQuestion;

public class kadane {
    public static  int maxSub(int[] nums){
        int sum = 0;
        int max = nums[0];

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum>max){
                max = sum;
            }if(sum<0){
                sum = 0;
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSub(arr));
    }
    
}

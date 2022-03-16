/*
input 1 = 3
input 2 = [1,2, 3]
output - 2
explanation
the order that occurs the minimum penalty is [1,2,3].the penalty is
abs(2-1) + abs(3-2) = 2
*/
package interviewCodingQuestion;

import java.util.Arrays;

public class accenturePenalty {

    public static int penalty(int arr[],int n){
        n = arr.length;
        Arrays.sort(arr);
        int res = 0;
        for(int i=1;i<n;i++){
            res = res +(arr[i]-arr[i-1]);
        }
        return Math.abs(res);

    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,4};
        int n =arr.length;

        System.out.println(penalty(arr, n));
    }
    
}

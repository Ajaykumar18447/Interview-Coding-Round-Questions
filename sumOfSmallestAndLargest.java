package interviewCodingQuestion;

import java.util.*;

    

public class sumOfSmallestAndLargest {
    public static int sumMinMax(int arr[]){
        int max =arr[0];
        int min =arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return max+min;
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,5};
        System.out.println(sumMinMax(arr));
    }
    
}

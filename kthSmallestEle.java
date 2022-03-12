/*
Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
*/

package interviewCodingQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class kthSmallestEle {
    public static int smallest(int arr[],int n , int k){
        Arrays.sort(arr);
        
        return (arr[k-1]);
    }
    public static void main(String[] args) {
        //int n = 6;
        // int arr[] = {7 , 10 , 4 , 3 ,20 , 15};
        //int k = 3;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int k = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println(smallest(arr, n, k));
    }
    
}

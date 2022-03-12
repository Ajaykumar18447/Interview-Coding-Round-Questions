/*
Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
*/


package interviewCodingQuestion;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthLargestEle {
    public static int largest(int arr[] ,int k ,int n )
    {

        /*Arrays.sort(arr);
        n = arr.length;

         return (arr[n-k]);
         */
//=================================================================================================================================================
         PriorityQueue<Integer> pq = new PriorityQueue<>();
          for(int ele:arr){
              pq.add(ele);
              if(pq.size()>k){
                  pq.poll();
              }
          }
          return pq.poll();

        
    }
    public static void main(String[] args) {
        int arr[]= {3,2,1,5,6,4};
        int k = 2;
        int n = 6;

        System.out.println(largest(arr, k, n));
    }
    
}

/*
Given an unsorted array of n elements, find if the element k is present in the array or not. Complete the findNumber function in the editor below.

It has 2 parameters:

An array of integers,arr,denoting the elements in the array.
An integer,k,denoting the element to be searched in the array.
The function must return a string “YES” or “NO” denoting if the element is present in the array or not.

Input Format

The first line contains an integers n,denoting the number of elements in the array arr.
Each line i of the n subsequent lines (where 0<=i<=n) contains an integer describing arri.
The next line contains an integer,k,the elements that needs to be searched.
Constraints

1 <= n <= 105
1 <= arr[i]<= 109
Output Format

The function must return a string “YES” or “NO” denoting if the element is present in the array or not.
This is printed to stdout by locked stub code in the editor.

Sample Input 0

5
1
2
3
4
5
1

Sample Output 0

YES

Explanation 0

Given the array =[1,2,3,4,5],we want to find the element 1 if it is present or not. We can find the element 1 at index = 0.Therefore we print “YES”.

Sample Input 1

3
2
3
1
5

Sample Output 1

NO

Explanation 1

Given the array[2,3,1] and k = 5. There is no element 5 in the array and therefore we print “NO”.
*/
package interviewCodingQuestion;

import java.util.Arrays;

public class findKthNum {
    public static void present(int arr[], int n, int k){
        int flag=0;
        Arrays.sort(arr);
        if(n==0){
            System.out.println("-1");
            return;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                flag =1;
            }
            
        }
       if(flag == 1){
        System.out.println("yes");
       }else{
           System.out.println("No");
       }
    }
    public static void main(String[] args) {
        int n = 0;
        int arr[] = {1,2,3,4,5};
        int k=10;
        present(arr, n, k);
    }
    
}

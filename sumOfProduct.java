/*
-sum of product 
input->
a1[] = {22,7,1,-5,5,-2}
a1[] = {4,-1,21,12,10,-3}
output - -102
explanation - 22*(-3)+7*10+1*12+-5*21+5*-1+-2*4 = -102



*/
package interviewCodingQuestion;

import java.util.Scanner;

public class sumOfProduct {
    public static int product(int arr1[],int arr2[] , int n){
        int sum=0;
        if(n==0){
            return -1;
        }
        for(int i=0;i<n;i++){
            sum += arr1[i]*arr2[n-1-i];
        }
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        
       
        System.out.println(product(arr1, arr2, n));

    }
    
}

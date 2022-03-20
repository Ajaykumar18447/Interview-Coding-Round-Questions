/*
Write a program to calculate the sum of elements of an array that are equal to the integer entered by the user. The inputs will be the size of the array, elements of the array, and an integer. You have to print the sum calculated after adding all the elements that match the integer entered by the user.
 Input:
1. Length
2. Input number
3. Element
 Output:
Sum of elements the same as the value
 Example:
Input:

8

1 2 3 4 2 5 6 2

2

Output:

6
*/
package interviewCodingQuestion;



public class sumUser {
    public static int sum(int arr[] , int n ,int value){
        int sum =0;
        for(int i=0;i<n;i++){
            if(arr[i]==value)
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=8;
        int arr[] = {1 ,2, 3, 4, 2, 3, 6, 2};
        int value = 3;

        System.out.println(sum(arr, n, value));
    }

    
}

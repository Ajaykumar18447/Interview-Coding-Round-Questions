/*
Ram is a 6 years old boy who loves to play with numeric legos. One day Ram’s mom created a number using those legos and asked ram to tell the number of elements available between two specific numbers ‘alpha1’ and ‘alpha2’. After 15 years when Ram started learning to program, he now wants to write a code to find the number of elements lies between ranges alpha1 and alpha2. If the number is arr and the starting and ending points are alpha1 and alpha2, find the numbers of elements lies in the range.
 Input:
Three space-separated integers
1. First is the length of arr.
2. Second is the starting point as alpha1.
3. The third is the endpoint as alpha2.
N space-separated array elements.
 Output:
Space-separated indexes between alpha1 and alpha2.
 Example:
Input:

9 2 6 1 2 3 4 5 6 7 8 9

Output:

1 2 3 4
*/
package interviewCodingQuestion;

public class starEnd {
    public static void alpha(int arr[], int n, int starting ,int ending){
        for(int i=0;i<n;i++){
            if(arr[i]>=starting && arr[i]<ending){
                System.out.print(i + " ");
            }
        }
        
    }
    public static void main(String[] args) {
        int n =9;
        int starting =2;
        int ending =6;
        int arr[]= {1,2,3,4,5,6,7,8,9};

        alpha(arr, n, starting, ending);
    } 
    
}

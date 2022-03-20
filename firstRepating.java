/*
Find the security key to access the bank account in from the encrypted message. 
The key in the message is the first repeating number from the given message of numbers.
 Input:
String
 Output:
The first repeating number from the message
 Example:
Input:

123456654321

Output:

1
*/
package interviewCodingQuestion;

import java.util.HashSet;

public class firstRepating {
    public static void repeating(int arr[]){
        int min =-1;

        HashSet<Integer> set = new HashSet<>();

        for(int i=arr.length-1;i>=0;i--){
            if(set.contains(arr[i]))
            min=i;
            else{
                set.add(arr[i]);
            }
        }
        if(min != -1)
        System.out.println(arr[min]);
        else{
            System.out.println("-1");
        }
         
    }
        
    

    public static void main(String[] args) {
        
        int arr[] = {2,3,4,5,6,6,5,4,3,2,1};
        

        repeating(arr);
        
    }
    
}

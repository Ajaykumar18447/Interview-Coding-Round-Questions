/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 
Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
*/
package interviewCodingQuestion;

public class palindromSkip {
  
    public static boolean pali(String s){
        int start =0 ; int end = s.length()-1;
        int count1= 0;int count2 =0;

        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                start++;
                count1++;
            }
        }
        start =0; end=s.length()-1;
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                end--;
                count2++;
            }
        }
        if(count1==0||count2==0) return true;
        if(count1==1||count2==1) return true;


        return false;
    }
    public static void main(String[] args) {
        String s = "abfffa";

        System.out.println(pali(s));
    }
    
}

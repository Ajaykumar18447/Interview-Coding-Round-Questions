/*
Problem: You are required to count the number of words in a sentence.
You are required to pass all the test cases

Test Cases :
Test Case : 1
Input : welcome to the world
Output : 4

Test Case : 2
Input : [space] say hello
Output : 2

Test Case : 3
Input : To get pass you need to study hard [space] [space]
Output : 8
*/

package interviewCodingQuestion;

import java.util.Scanner;

public class countString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        
        if(s==null || s.length()==0){
            System.out.println("0");
        }

        String ans[] = s.split(" ");
        System.out.println(ans.length);

    }
    
}

package interviewCodingQuestion;

import java.util.Scanner;

public class subPalindrome {
    public static void sub(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalindrom(str.substring(i,j))){
                    System.out.println(str.substring(i,j));
                }
            }
        }

    }

    public static  boolean isPalindrom(String str){
        int i =0; int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sub(str);
    }
    
}
